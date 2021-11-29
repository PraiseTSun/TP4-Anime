package org.example;

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




}
