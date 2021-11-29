package org.example;

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

    private String requetValue = "";
    private String typeValue = "";
    private String ratedValue = "";


    public void animeMainMenuHandler(){
        defaultValues();
        String commande = "";

        System.out.println(PROGRAMME_TITLE);
        System.out.println();

        while(!commande.equals("q")){
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
            }
        }
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
            if(e.equals(element))
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
