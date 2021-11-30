package org.example;

import java.util.HashMap;
import java.util.Map;

public class AnimeMoreInfo {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private int mal_id;
    private String url;
    private String image_url;
    private String trailer_url;
    private String title;
    private String title_english;
    private String title_japanese;
    private String title_synonyms;
    private String type;
    private String source;
    private int episodes;
    private String status;
    private boolean airing;
    private Aired aired;
    private String duration;
    private String rating;
    private float score;
    private int score_by;
    private int rank;
    private int popularity;
    private int members;
    private int favorites;
    private String synopsis;
    private String background;
    private String premiered;
    private String broadcast;
    private Map<String, Related[]> related;
    private Related[] producers;
    private Related[] licensors;
    private Related[] studios;
    private Related[] genres;
    private Related[] explicit_genres;
    private Related[] demographics;
    private Related[] themes;
    private String[] opening_themes;
    private String[] ending_themes;
    private Link[] external_links;

    public AnimeMoreInfo() {
        this.request_hash = "";
        this.request_cached = false;
        this.request_cache_expiry = 0;
        this.mal_id = 0;
        this.url = "";
        this.image_url = "";
        this.trailer_url = "";
        this.title = "";
        this.title_english = "";
        this.title_japanese = "";
        this.title_synonyms = "";
        this.type = "";
        this.source = "";
        this.episodes = 0;
        this.status = "";
        this.airing = false;
        this.aired = new Aired();
        this.duration = "";
        this.rating = "";
        this.score = 0f;
        this.score_by = 0;
        this.rank = 0;
        this.popularity = 0;
        this.members = 0;
        this.favorites = 0;
        this.synopsis = "";
        this.background = "";
        this.premiered = "";
        this.broadcast = "";
        this.related = new HashMap<>();
        this.producers = new Related[0];
        this.licensors = new Related[0];
        this.studios = new Related[0];
        this.genres = new Related[0];
        this.explicit_genres = new Related[0];
        this.demographics = new Related[0];
        this.themes = new Related[0];
        this.opening_themes = new String[0];
        this.ending_themes = new String[0];
        this.external_links = new Link[0];
    }

    public AnimeMoreInfo(String request_hash, boolean request_cached, int request_cache_expiry, int mal_id, String url, String image_url, String trailer_url, String title, String title_english, String title_japanese, String title_synonyms, String type, String source, int episodes, String status, boolean airing, Aired aired, String duration, String rating, float score, int score_by, int rank, int popularity, int members, int favorites, String synopsis, String background, String premiered, String broadcast, Map<String, Related[]> related, Related[] producers, Related[] licensors, Related[] studios, Related[] genres, Related[] explicit_genres, Related[] demographics, Related[] themes, String[] opening_themes, String[] ending_themes, Link[] external_links) {
        this.request_hash = request_hash;
        this.request_cached = request_cached;
        this.request_cache_expiry = request_cache_expiry;
        this.mal_id = mal_id;
        this.url = url;
        this.image_url = image_url;
        this.trailer_url = trailer_url;
        this.title = title;
        this.title_english = title_english;
        this.title_japanese = title_japanese;
        this.title_synonyms = title_synonyms;
        this.type = type;
        this.source = source;
        this.episodes = episodes;
        this.status = status;
        this.airing = airing;
        this.aired = aired;
        this.duration = duration;
        this.rating = rating;
        this.score = score;
        this.score_by = score_by;
        this.rank = rank;
        this.popularity = popularity;
        this.members = members;
        this.favorites = favorites;
        this.synopsis = synopsis;
        this.background = background;
        this.premiered = premiered;
        this.broadcast = broadcast;
        this.related = related;
        this.producers = producers;
        this.licensors = licensors;
        this.studios = studios;
        this.genres = genres;
        this.explicit_genres = explicit_genres;
        this.demographics = demographics;
        this.themes = themes;
        this.opening_themes = opening_themes;
        this.ending_themes = ending_themes;
        this.external_links = external_links;
    }

    public String getRequest_hash() {
        return request_hash;
    }

    public void setRequest_hash(String request_hash) {
        this.request_hash = request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public void setRequest_cached(boolean request_cached) {
        this.request_cached = request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public void setRequest_cache_expiry(int request_cache_expiry) {
        this.request_cache_expiry = request_cache_expiry;
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

    public String getTrailer_url() {
        return trailer_url;
    }

    public void setTrailer_url(String trailer_url) {
        this.trailer_url = trailer_url;
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

    public String getTitle_synonyms() {
        return title_synonyms;
    }

    public void setTitle_synonyms(String title_synonyms) {
        this.title_synonyms = title_synonyms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAiring() {
        return airing;
    }

    public void setAiring(boolean airing) {
        this.airing = airing;
    }

    public Aired getAired() {
        return aired;
    }

    public void setAired(Aired aired) {
        this.aired = aired;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getScore_by() {
        return score_by;
    }

    public void setScore_by(int score_by) {
        this.score_by = score_by;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getFavorites() {
        return favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
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

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public Map<String, Related[]> getRelated() {
        return related;
    }

    public void setRelated(Map<String, Related[]> related) {
        this.related = related;
    }

    public Related[] getProducers() {
        return producers;
    }

    public void setProducers(Related[] producers) {
        this.producers = producers;
    }

    public Related[] getLicensors() {
        return licensors;
    }

    public void setLicensors(Related[] licensors) {
        this.licensors = licensors;
    }

    public Related[] getStudios() {
        return studios;
    }

    public void setStudios(Related[] studios) {
        this.studios = studios;
    }

    public Related[] getGenres() {
        return genres;
    }

    public void setGenres(Related[] genres) {
        this.genres = genres;
    }

    public Related[] getExplicit_genres() {
        return explicit_genres;
    }

    public void setExplicit_genres(Related[] explicit_genres) {
        this.explicit_genres = explicit_genres;
    }

    public Related[] getDemographics() {
        return demographics;
    }

    public void setDemographics(Related[] demographics) {
        this.demographics = demographics;
    }

    public Related[] getThemes() {
        return themes;
    }

    public void setThemes(Related[] themes) {
        this.themes = themes;
    }

    public String[] getOpening_themes() {
        return opening_themes;
    }

    public void setOpening_themes(String[] opening_themes) {
        this.opening_themes = opening_themes;
    }

    public String[] getEnding_themes() {
        return ending_themes;
    }

    public void setEnding_themes(String[] ending_themes) {
        this.ending_themes = ending_themes;
    }

    public Link[] getExternal_links() {
        return external_links;
    }

    public void setExternal_links(Link[] external_links) {
        this.external_links = external_links;
    }
}
