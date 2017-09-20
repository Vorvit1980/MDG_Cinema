package dev.barmaglot.com.mdg_cinema.seances;

import dev.barmaglot.com.mdg_cinema.Film;

/**
 * Created by vorvit1980 on 19.09.2017.
 */

public class SeancesSubItem {
    private String time;
    private Film film;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
