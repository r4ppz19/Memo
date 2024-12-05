package model;

public class MainModel {
    private String txt;
    private int time;
    private int date;

    public MainModel() {}

    public MainModel(String txt, int date, int time) {
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
    public void setTime(int time) {
        this.time = time;
    }

    // Get method of time
    public int getTime() {
        return time;
    }

    // Set method of date
    public void setDate(int date) {
        this.date = date;
    }

    // Get method of date
    public int getDate() {
        return date;
    }

}
