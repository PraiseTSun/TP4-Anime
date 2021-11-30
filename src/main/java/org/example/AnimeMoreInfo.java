package org.example;

import java.util.HashMap;
import java.util.Map;

public class AnimeMoreInfo {
    private String title;
    private String title_english;
    private String title_japanese;
    private String synopsis;
    private String background;

    public AnimeMoreInfo() {
        this.title = "";
        this.title_english = "";
        this.title_japanese = "";
        this.synopsis = "";
        this.background = "";
    }

    public AnimeMoreInfo(String title, String title_english, String title_japanese, String synopsis, String background) {
        this.title = title;
        this.title_english = title_english;
        this.title_japanese = title_japanese;
        this.synopsis = synopsis;
        this.background = background;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_english() {
        return title_english;
    }

    public void setTitle_english(String title_english) {
        this.title_english = title_english;
    }

    public String getTitle_japanese() {
        return title_japanese;
    }

    public void setTitle_japanese(String title_japanese) {
        this.title_japanese = title_japanese;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}
