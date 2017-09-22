package dev.barmaglot.com.mdg_cinema;

import android.text.format.Time;

import java.util.ArrayList;

/**
 * Created by vorvit1980 on 20.09.2017.
 */

public class Utils {
    private Film film;
    private Seance seance;
    private ArrayList<Film> filmArrayList;
    private ArrayList<Seance> seanceArrayList;
    private Time time;

    public Utils() {
        filmArrayList = new ArrayList<>();
        seanceArrayList = new ArrayList<>();

        film = new Film("Графомафия", "Графомафия", "FilmUrl1", 90);
        addSeance(12, 150, 0, 0, 16, 22, 8, 2017);
        addSeance(12, 150, 0, 0, 15, 24, 8, 2017);
        addSeance(12, 150, 0, 0, 15, 26, 8, 2017);
        addSeance(12, 150, 0, 30, 14, 27, 8, 2017);
        addSeance(12, 150, 0, 0, 19, 29, 8, 2017);
        filmArrayList.add(film);

        film = new Film("Валериан и город тысячи планет", "Валериан и город тысячи планет", "FilmUrl", 129);
        addSeance(12, 200, 0, 30, 17, 22, 8, 2017);
        addSeance(12, 200, 0, 0, 17, 24, 8, 2017);
        addSeance(12, 200, 0, 0, 17, 26, 8, 2017);
        addSeance(12, 200, 0, 0, 16, 29, 8, 2017);
        addSeance(12, 200, 0, 0, 16, 31, 8, 2017);
        addSeance(12, 200, 0, 45, 16, 2, 9, 2017);
        addSeance(12, 200, 0, 45, 16, 3, 9, 2017);
        filmArrayList.add(film);

        film = new Film("Темная башня", "Темная башня", "FilmUrl", 95);
        addSeance(16, 200, 0, 45, 19, 22, 8, 2017);
        filmArrayList.add(film);

        film = new Film("Бабушка легкого поведения","Бабушка легкого поведения","FilmUrl",86);
        addSeance(16,150,0,30,21,22,8,2017);
        addSeance(16,150,0,15,19,24,8,2017);
        addSeance(16,150,0,15,19,26,8,2017);
        addSeance(16,150,0,0,16,27,8,2017);
        addSeance(16,150,0,30,14,29,8,2017);
        filmArrayList.add(film);

        film = new Film("Терминатор 2 (3D)","Терминатор 2 (3D)","FilmUrl",137);
        addSeance(18,200,0,45,20,26,8,2017);
        addSeance(18,200,0,30,17,27,8,2017);
        addSeance(18,200,0,35,20,29,8,2017);
        addSeance(18,200,0,30,18,31,8,2017);
        addSeance(18,200,0,45,20,2,9,2017);
        addSeance(18,200,0,45,20,3,9,2017);
        filmArrayList.add(film);

        film = new Film("Ночь кино", "Ночь кино", "FilmUrl",0);
        addSeance(12,0,0,0,20,27,8,2017);
        filmArrayList.add(film);

        film = new Film("Гоголь. Начало","Гоголь. Начало","FilmUrl",100);
        addSeance(16,200,0,0,21,31,8,2017);
        addSeance(16,200,0,0,19,2,9,2017);
        addSeance(16,200,0,0,19,3,9,2017);
        filmArrayList.add(film);

        film=new Film("Банда котиков","Банда котиков","FilmUrl",92);
        addSeance(6,150,0,0,15,3,9,2017);
        filmArrayList.add(film);

    }

    private void addSeance(int age, int price, int second, int minute, int hour, int monthDay,
                           int month, int year) {
        seance = new Seance();
        seance.setAge(age);
        seance.setPrice(price);
        time = new Time();
        time.second = second;
        time.minute = minute;
        time.hour = hour;
        time.monthDay = monthDay;
        time.month = month;
        time.year = year;
        seance.setTime(time);
        film.addSeanceToList(seance);
    }

    public ArrayList<Film> getFilmArrayList(){
        return filmArrayList;
    }
}
