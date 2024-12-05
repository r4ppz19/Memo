package com.r4ppz.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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

    // Get method of txt
    public String getTxt() {
        return txt;
    }

    // Set method of time
    public void setTime(String time) {
        this.time = time;
    }

    // Get method of time
    public String getTime() {
        return time;
    }

    // Set method of date
    public void setDate(String date) {
        this.date = date;
    }

    // Get method of date
    public String getDate() {
        return date;
    }

    // Get current time method
    public String getCurrentTime() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter);
    }

    // Get current date method
    public String getCurrentDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return date.format(formatter);
    }

}
