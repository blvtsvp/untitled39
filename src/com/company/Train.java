package com.company;

import java.util.Comparator;

public class Train {
    int number;
    String str0, str1, time;
    Train(int number, String str0, String str1, String time){
        this.number = number;
        this.str0 = str0;
        this.time = time;

    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStr0() {
        return str0;
    }

    public void setStr0(String str0) {
        this.str0 = str0;
    }


    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public static Comparator<Train> NumberComparator = new Comparator<Train>() {
    public int compare(Train a1,Train a2) {
        return a1.getNumber() - a2.getNumber();
    }
};


public static void main(String[] args) {

    }
}
