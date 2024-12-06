package com.r4ppz.model;

public class MainModel {
    private String txt;
    private String time;
    private String date;

    // Default constructor
    public MainModel() {}

    // Second constructor
    public MainModel(String txt, String date, String time) {
        this.txt = txt;
        this.date = date;
        this.time = time;
    }

    // Set method of txt
    public void setTxt(String txt) {
        this.txt = txt;
    }

    // Set method of time
    public void setTime(String time) {
        this.time = time;
    }

    // Set method of date
    public void setDate(String date) {
        this.date = date;
    }    

    // Get method of txt
    public String getTxt() {
        return txt;
    }

    // Get method of time
    public String getTime() {
        return time;
    }

    // Get method of date
    public String getDate() {
        return date;
    }
}
