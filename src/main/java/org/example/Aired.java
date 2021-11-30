package org.example;

public class Aired {
    private String from;
    private String to;
    private Prop prop;
    private String string;

    public Aired() {
        this.from = "";
        this.to = "";
        this.prop = new Prop();
        this.string = "";
    }

    public Aired(String from, String to, Prop prop, String string) {
        this.from = from;
        this.to = to;
        this.prop = prop;
        this.string = string;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Prop getProp() {
        return prop;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
