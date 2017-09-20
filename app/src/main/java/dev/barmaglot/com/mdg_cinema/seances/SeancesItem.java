package dev.barmaglot.com.mdg_cinema.seances;

import java.util.ArrayList;

/**
 * Created by vorvit1980 on 19.09.2017.
 */

public class SeancesItem {
    private String date;
    private ArrayList<SeancesSubItem> seancesSubItemArrayList;

    public SeancesItem() {
        seancesSubItemArrayList = new ArrayList<>();
    }

    public void addSubItemToList(SeancesSubItem seancesSubItem) {
        seancesSubItemArrayList.add(seancesSubItem);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
