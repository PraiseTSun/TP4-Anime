package org.example;

public class Anime {
    private int mal_id;
    private String title;
    private String rated;

    public Anime() {
        this.mal_id = 0;
        this.title = null;
        this.rated = null;
    }

    public Anime(int mal_id, String title, String rated) {
        this.mal_id = mal_id;
        this.title = title;
        this.rated = rated;
    }

    public int getMal_id() {
        return mal_id;
    }

    public void setMal_id(int mal_id) {
        this.mal_id = mal_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }
}
