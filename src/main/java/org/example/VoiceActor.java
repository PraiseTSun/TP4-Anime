package org.example;

public class VoiceActor {
    private int mal_id;
    private String name;
    private String url;
    private String image_url;
    private String language;

    public VoiceActor() {
        this.mal_id = 0;
        this.name = "";
        this.url = "";
        this.image_url = "";
        this.language = "";
    }

    public VoiceActor(int mal_id, String name, String url, String image_url, String language) {
        this.mal_id = mal_id;
        this.name = name;
        this.url = url;
        this.image_url = image_url;
        this.language = language;
    }

    public int getMal_id() {
        return mal_id;
    }

    public void setMal_id(int mal_id) {
        this.mal_id = mal_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "VoiceActor{" +
                "mal_id=" + mal_id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", image_url='" + image_url + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
