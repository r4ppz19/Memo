package model;

public class TxtModel {
    private String txt;
    private int time;
    private int date;

    public TxtModel(String txt, int date, int time) {
        this.txt = txt;
        this.date = date;
        this.time = time;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getTxt() {
        return txt;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int setTime() {
        return time;
    }

    public void set(int date) {
        this.date = date;
    }

    public int setDate() {
        return date;
    }

}
