package org.example;

public class Prop {
    private Date from;
    private Date to;

    public Prop() {
        this.from = new Date();
        this.to = new Date();
    }

    public Prop(Date from, Date to) {
        this.from = from;
        this.to = to;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
