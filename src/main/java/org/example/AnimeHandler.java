package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AnimeHandler {
    private final String PROGRAMME_TITLE = "****************************************************************\n" +
                                           "*                  ANIME API QUERY PRO V1.4                    *\n" +
                                           "****************************************************************";
    private final String LINE =            "----------------------------------------------------------------";
    private final String REQUETE_KEY = "a";
    private final String TYPE_KEY = "b";
    private final String RATED_KEY = "c";
    private final String RECHERCHE_KEY = "r";
    private final String QUITTER_KEY = "q";
    private final List<String> CHOOSE_LIST = new ArrayList<>(List.of(
            RECHERCHE_KEY,
            TYPE_KEY,
            RATED_KEY,
            RECHERCHE_KEY,
            QUITTER_KEY
    ));



    private void printMainMenu(){
        System.out.println(PROGRAMME_TITLE);
        System.out.println();
        System.out.println();
        System.out.println(LINE);
        System.out.println(REQUETE_KEY  + ". Requete : ''");
        System.out.println(TYPE_KEY     + ". Type    : '*'");
        System.out.println(RATED_KEY    + ". Rated   : '*'");
        System.out.println(LINE);
        System.out.println(RECHERCHE_KEY + ". Rechercher");
        System.out.println(QUITTER_KEY + ". Quitter");
        System.out.println(LINE);
        for (int i = 0; i < CHOOSE_LIST.size(); i++) {
            System.out.print(CHOOSE_LIST.get(i) + ",");
            if(i != CHOOSE_LIST.size()-2)
                System.out.print(",");
        }
        System.out.println();
        System.out.println("Enter command → ");
    }

    private String getCommandLineInput(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = "";
        try {command = reader.readLine();} catch (IOException e) {}
        return command;
    }
}
