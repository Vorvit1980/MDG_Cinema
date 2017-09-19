package dev.barmaglot.com.mdg_cinema.example;

/**
 * Created by vorvit1980 on 19.09.2017.
 */

public class SubItem {
    private String time;
    private String name;
    private int type;

    public int getType() {
        return type;
    }

    public SubItem(){
        type = 1;

    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
