package org.example;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class AnimeHandler {
    private final String JIKAN_URL = "https://api.jikan.moe/v3";
    private final String TYPE = "/anime";
    private final String SEARCH_EXTENTION = "/search";
    private final String STRING_SEARCH_EXTENTION = "?q=";

    private final String PROGRAMME_TITLE = "****************************************************************\n" +
                                           "*                  ANIME API QUERY PRO V1.4                    *\n" +
                                           "****************************************************************";
    private final String LINE =            "----------------------------------------------------------------";
    private final String LINE_INFO = "+" + LINE + "+";
    private final String REQUETE_KEY = "a";
    private final String TYPE_KEY = "b";
    private final String RATED_KEY = "c";
    private final String RECHERCHE_KEY = "r";
    private final String QUITTER_KEY = "q";
    private final List<String> MAIN_MENU_LIST = new ArrayList<String>(List.of(
            REQUETE_KEY,
            TYPE_KEY,
            RATED_KEY,
            RECHERCHE_KEY,
            QUITTER_KEY
    ));

    private final List<String> TYPE_LIST = new ArrayList<String>(List.of("*", "tv", "movie", "ova"));
    private final List<String> RATED_LIST = new ArrayList<String>(List.of("*", "g", "pg", "pg13"));

    private String requetValue = "cowboy";
    private String typeValue = "tv";
    private String ratedValue = "g";


    public void animeMainMenuHandler(){
        //defaultValues();
        String commande = "";

        System.out.println(PROGRAMME_TITLE);
        System.out.println();

        while(!commande.equals(QUITTER_KEY)){
            printMainMenu();
            commande = getCommandLineInput();

            switch (commande){
                case REQUETE_KEY:
                    requetValue = getCommandLineInput();
                    break;
                case TYPE_KEY:
                    typeHandler();
                    break;
                case RATED_KEY:
                    ratedHandler();
                    break;

                case RECHERCHE_KEY:
                    try {rechercheHandler();} catch (Exception e) {
                        System.out.println("Error " + e);
                    }

                    analyseResults();
                    break;
            }
        }
    }

    private void analyseResults(){
        String commande = "";
        List<Anime> animesList= new ArrayList<>();

        try {
            for (Anime a : rechercheHandler().getResults()) {
                if(isElementAccepted(a.getRated(), RATED_LIST))
                    animesList.add(a);
                if(animesList.size() == 5)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        while(!commande.equals(QUITTER_KEY)){
            printResultsAnalyse(animesList);
            commande = getCommandLineInput();

            if(!commande.equals(QUITTER_KEY)){
                printAnimeInfo(animesList.get(Integer.parseInt(commande) - 1));
                getCommandLineInput();
            }
        }
    }

    private AnimeMoreInfo getMoreInfo(int id) throws Exception {
        URL url = new URL(JIKAN_URL + TYPE + "/" + id);
        HttpURLConnection conn = (HttpsURLConnection) url.openConnection();

        conn.setRequestMethod("GET");


        String content = "";
        try(BufferedReader r = new BufferedReader(new InputStreamReader(conn.getInputStream()))){
            String line;
            while((line = r.readLine()) != null){
                content += line;
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        AnimeMoreInfo moreInfo = mapper.readValue(content, AnimeMoreInfo.class);
        //Etape 4 - Fermer la connexion
        conn.disconnect();

        return moreInfo;
    }

    private AnimeCharacters getCharacters(int id) throws Exception {
        URL url = new URL(JIKAN_URL + TYPE + "/" + id + "/characters_staff");
        HttpURLConnection conn = (HttpsURLConnection) url.openConnection();

        conn.setRequestMethod("GET");


        String content = "";
        try(BufferedReader r = new BufferedReader(new InputStreamReader(conn.getInputStream()))){
            String line;
            while((line = r.readLine()) != null){
                content += line;
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        AnimeCharacters characters = mapper.readValue(content, AnimeCharacters.class);
        //Etape 4 - Fermer la connexion
        conn.disconnect();

        return characters;
    }

    private JikanResult rechercheHandler() throws Exception {
        JikanResult rechercheResult = new JikanResult();
        String link = JIKAN_URL + SEARCH_EXTENTION + TYPE;

        link += STRING_SEARCH_EXTENTION + URLEncoder.encode(requetValue, StandardCharsets.UTF_8);

        if(!typeValue.equals("*"))
            link += "&type=" + typeValue;

        if(!ratedValue.equals("*"))
            link += "&rated=" + ratedValue;

        System.out.println(link);
        URL url = new URL(link);
        HttpURLConnection conn = (HttpsURLConnection) url.openConnection();

        //Etape 2 - Parametrer la requete
        conn.setRequestMethod("GET");

        //Etape 3 - Envoyer la requete et gerer la reponse
        int statusCode = conn.getResponseCode();
        if(!isStatusCodeAccepted(statusCode)){
            conn.disconnect();
            return rechercheResult;
        }


        String content = "";
        try(BufferedReader r = new BufferedReader(new InputStreamReader(conn.getInputStream()))){
            String line;
            while((line = r.readLine()) != null){
                content += line;
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        rechercheResult = mapper.readValue(content, JikanResult.class);
        //Etape 4 - Fermer la connexion
        conn.disconnect();

        return rechercheResult;
    }

    private void typeHandler(){
        String commande = "";
        System.out.println("Enter type");
        printChoice(TYPE_LIST);
        commande = getCommandLineInput();

        if(isElementAccepted(commande, TYPE_LIST))
            typeValue = commande;
        else
            System.out.println("Type " + commande + " is not allow.");
    }

    private void ratedHandler(){
        String commande = "";
        System.out.println("Enter rated");
        printChoice(RATED_LIST);
        commande = getCommandLineInput();

        if(isElementAccepted(commande, RATED_LIST))
            ratedValue = commande;
        else
            System.out.println("Rated " + commande + " is not allow.");
    }

    private boolean isElementAccepted (String element, List<String> list) {
        for (String e : list) {
            if(e.equals(element.toLowerCase()))
                return true;
        }
        return false;
    }

    private boolean isStatusCodeAccepted (int statusCode){
        System.out.println(getStatusCode(statusCode));
        if (statusCode == 200)
            return true;
        return false;
    }

    private void printAnimeInfo(Anime anime){
        AnimeCharacters characters = new AnimeCharacters();
        try { characters = getCharacters(anime.getMal_id()); } catch (Exception e) {
            System.out.println(e);
        }
        AnimeMoreInfo moreInfo = new AnimeMoreInfo();
        try {moreInfo = getMoreInfo(anime.getMal_id());} catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(LINE_INFO);
        System.out.println(moreInfo.getTitle());
        System.out.println(moreInfo.getTitle_english());
        System.out.println(moreInfo.getTitle_japanese());
        System.out.println(LINE_INFO);
        System.out.println(moreInfo.getSynopsis());
        System.out.println(LINE_INFO);
        System.out.println(moreInfo.getBackground());
        System.out.println(LINE_INFO);
        System.out.println("Main characters :");
        for (Character character : characters.getCharacters()){
            if(character.getRole().equals("Main"))
                System.out.println(character.getName());
        }
        System.out.println(LINE_INFO);
        System.out.println("Press <enter> to go back to results.");
    }

    private void printChoice (List<String> elements){
        System.out.print("Choose one of : ");
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i));
            if(i != elements.size()-1)
                System.out.print(",");
        }
        System.out.println();
    }

    private void printMainMenu(){
        System.out.println();
        System.out.println(LINE);
        System.out.println(REQUETE_KEY  + ". Requete : '" + requetValue + "'");
        System.out.println(TYPE_KEY     + ". Type    : '" + typeValue + "'");
        System.out.println(RATED_KEY    + ". Rated   : '" + ratedValue + "'");
        System.out.println(LINE);
        System.out.println(RECHERCHE_KEY + ". Rechercher");
        System.out.println(QUITTER_KEY + ". Quitter");
        System.out.println(LINE);
        printChoice(MAIN_MENU_LIST);
    }

    private void printResultsAnalyse(List<Anime> animesList){
        System.out.println(LINE);
        for(int i = 1; i <= animesList.size(); i++)
            System.out.println(i + ". " + animesList.get(i-1).getTitle());
        System.out.println(LINE);
        System.out.println(QUITTER_KEY + ". Quitter");
        System.out.println(LINE);
        System.out.print("Choose one of : ");
        for(int i = 1; i <= animesList.size(); i++){
            System.out.print(i + ",");
        }
        System.out.println("q");
    }

    private String getStatusCode (int statusCode){
        switch (statusCode){
            case 200 : return "The request was successful.";
            case 304 : return "You have the lastest data.";
            case 400 : return "You've made an invalid request.";
            case 404 : return "Resource not found, i.e MyAnimeList responded with a 404.";
            case 405 : return "Request method is not supported for resource.";
            case 429 : return "You are being rate limited or Jikan is being rate limited by MyAnimeList (either is specified in the error message)";
            case 500 : return "Something is not working on our end, please open a Github issue by clicking on the generated report_url.";
            case 503 : return "Something is not working on MyAnimeList’s end. MyAnimeList is either down/unavailable or is refusing to connect.";
            default: return "Status Code Not Found.";
        }
    }

    private String getCommandLineInput(){
        System.out.print("Enter command → ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = "";
        try {command = reader.readLine();} catch (IOException e) {}
        return command;
    }

    private void defaultValues(){
        requetValue = "";
        typeValue = "*";
        ratedValue = "*";
    }
}
