package dev.barmaglot.com.mdg_cinema;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String filmName;
    private String filmDescription;
    private String filmUrl;
    private int filmDuration;

    private ArrayList<Seance> seanceList;

    public Film(String filmName, String filmDescription, String filmUrl, int filmDuration) {
        seanceList = new ArrayList<>();
        this.filmName = filmName;
        this.filmDescription = filmDescription;
        this.filmUrl = filmUrl;
        this.filmDuration = filmDuration;
    }

    public String getFilmDescription() {
        return filmDescription;
    }


    public String getFilmUrl() {
        return filmUrl;
    }

    public int getFilmDuration() {
        return filmDuration;
    }



    public ArrayList<Seance> getSeanceList() {
        return seanceList;
    }


    public String getFilmName() {
        return filmName;
    }

    public void addSeanceToList(Seance seance) {
        seanceList.add(seance);
    }


}
