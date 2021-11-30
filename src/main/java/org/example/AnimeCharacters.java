package org.example;

public class AnimeCharacters {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private Character[] characters;
    private Staff[] staff;

    public AnimeCharacters() {
        this.request_hash = "";
        this.request_cached = false;
        this.request_cache_expiry = 0;
        this.characters = null;
        this.staff = null;
    }

    public AnimeCharacters(String request_hash, boolean request_cached, int request_cache_expiry, Character[] characters, Staff[] staff) {
        this.request_hash = request_hash;
        this.request_cached = request_cached;
        this.request_cache_expiry = request_cache_expiry;
        this.characters = characters;
        this.staff = staff;
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

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }

    public Staff[] getStaff() {
        return staff;
    }

    public void setStaff(Staff[] staff) {
        this.staff = staff;
    }
}
