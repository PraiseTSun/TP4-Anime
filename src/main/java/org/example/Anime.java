package org.example;

public class Anime {
    private int mal_id;
    private String url;
    private String image_url;
    private String title;
    private boolean airing;
    private String synopsis;
    private String type;
    private int episodes;
    private float score;
    private String start_date;
    private String end_date;
    private int members;
    private String rated;

    public Anime() {
        this.mal_id = 0;
        this.url = null;
        this.image_url = null;
        this.title = null;
        this.airing = false;
        this.synopsis = null;
        this.type = null;
        this.episodes = 0;
        this.score = 0f;
        this.start_date = null;
        this.end_date = null;
        this.members = 0;
        this.rated = null;
    }

    public Anime(int mal_id, String url, String image_url, String title, boolean airing, String synopsis, String type, int episodes, float score, String start_date, String end_date, int members, String rated) {
        this.mal_id = mal_id;
        this.url = url;
        this.image_url = image_url;
        this.title = title;
        this.airing = airing;
        this.synopsis = synopsis;
        this.type = type;
        this.episodes = episodes;
        this.score = score;
        this.start_date = start_date;
        this.end_date = end_date;
        this.members = members;
        this.rated = rated;
    }

    public int getMal_id() {
        return mal_id;
    }

    public void setMal_id(int mal_id) {
        this.mal_id = mal_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAiring() {
        return airing;
    }

    public void setAiring(boolean airing) {
        this.airing = airing;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }
}
