package org.example;

import java.util.Arrays;

public class JikanResult {
    private String request_hash;
    private boolean request_cached;
    private int request_cache_expiry;
    private Anime[] results;
    private int last_page;

    public JikanResult() {
        this.request_hash = "";
        this.request_cached = false;
        this.request_cache_expiry = 0;
        this.results = null;
        this.last_page = 0;
    }

    public JikanResult(String request_hash, boolean request_cached, int request_cache_expiry, Anime[] results, int last_page) {
        this.request_hash = request_hash;
        this.request_cached = request_cached;
        this.request_cache_expiry = request_cache_expiry;
        this.results = results;
        this.last_page = last_page;
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

    public Anime[] getResults() {
        return results;
    }

    public void setResults(Anime[] results) {
        this.results = results;
    }

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    @Override
    public String toString() {
        return "JikanResult{" +
                "request_hash='" + request_hash + '\'' +
                ", request_cached=" + request_cached +
                ", request_cache_expiry=" + request_cache_expiry +
                ", results=" + Arrays.toString(results) +
                ", last_page=" + last_page +
                '}';
    }
}
