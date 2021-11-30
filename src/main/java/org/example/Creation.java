package org.example;

public class Creation {
    private Date from;
    private Date to;

    public Creation() {
        this.from = new Date();
        this.to = new Date();
    }

    public Creation(Date from, Date to) {
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
