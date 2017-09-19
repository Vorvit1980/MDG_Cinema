package dev.barmaglot.com.mdg_cinema.example;

import java.util.ArrayList;

/**
 * Created by vorvit1980 on 19.09.2017.
 */

public class Item {
    private String date;
    private ArrayList<SubItem> subItemArrayList;
    private int type;

    public int getType() {
        return type;
    }

    public Item(){
        subItemArrayList = new ArrayList<>();
        type = 0;

    }

    public void addSubItemToList(SubItem subItem) {
        subItemArrayList.add(subItem);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<SubItem> getSubItemArrayList() {
        return subItemArrayList;
    }
}
