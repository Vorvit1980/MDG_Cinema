package dev.barmaglot.com.mdg_cinema;

import android.text.format.Time;

public class Seance {
    private int age;
    private int price;
    private Time time;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }


    public int getPrice() {
        return price;
    }

}
