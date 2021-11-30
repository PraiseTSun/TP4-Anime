package org.example;

public class Staff {
    private int mal_id;
    private String url;
    private String name;
    private String image_url;
    private String[] positions;

    public Staff() {
        this.mal_id = 0;
        this.url = "";
        this.name = "";
        this.image_url = "";
        this.positions = new String[0];
    }

    public Staff(int mal_id, String url, String name, String image_url, String[] positions) {
        this.mal_id = mal_id;
        this.url = url;
        this.name = name;
        this.image_url = image_url;
        this.positions = positions;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String[] getPositions() {
        return positions;
    }

    public void setPositions(String[] positions) {
        this.positions = positions;
    }
}
