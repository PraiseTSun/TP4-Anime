package org.example;

import java.util.Arrays;

public class JikanResult {

    private Anime[] results;


    public JikanResult() {
        this.results = new Anime[0];
    }

    public JikanResult(Anime[] results) {
        this.results = results;
    }


    public Anime[] getResults() {
        return results;
    }

    public void setResults(Anime[] results) {
        this.results = results;
    }

}
