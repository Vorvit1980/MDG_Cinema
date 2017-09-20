package dev.barmaglot.com.mdg_cinema.films;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import dev.barmaglot.com.mdg_cinema.R;
import dev.barmaglot.com.mdg_cinema.Utils;
import dev.barmaglot.com.mdg_cinema.seances.SeancesSubItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class FilmsFragment extends Fragment {

    private FilmsItem filmsItem = null;
    private SeancesSubItem seancesSubItem = null;
    private Utils utils;

    public FilmsFragment() {
        // Required empty public constructor
        utils = new Utils();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(
                R.layout.recycler_view, container, false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Object> itemArrayList = new ArrayList<>();

        filmsItem = new FilmsItem();//0
        filmsItem.setDate("22.08");
        itemArrayList.add(filmsItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("16:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(0));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("17:30");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(1));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("19:45");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(2));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("21:30");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(3));
        itemArrayList.add(seancesSubItem);

        filmsItem = new FilmsItem();//5
        filmsItem.setDate("24.08");
        itemArrayList.add(filmsItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("15:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(0));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("17:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(1));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("19:15");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(3));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("20:45");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(4));
        itemArrayList.add(seancesSubItem);

        filmsItem = new FilmsItem();//10
        filmsItem.setDate("26.08");
        itemArrayList.add(filmsItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("15:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(0));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("17:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(1));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("19:15");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(3));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("20:45");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(4));
        itemArrayList.add(seancesSubItem);

        filmsItem = new FilmsItem();//15
        filmsItem.setDate("27.08");
        itemArrayList.add(filmsItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("14:30");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(0));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("16:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(3));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("17:30");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(4));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("20:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(5));
        itemArrayList.add(seancesSubItem);

        filmsItem = new FilmsItem();//20
        filmsItem.setDate("29.08");
        itemArrayList.add(filmsItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("14:30");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(3));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("16:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(1));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("19:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(0));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("20:35");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(4));
        itemArrayList.add(seancesSubItem);

        filmsItem = new FilmsItem();//25
        filmsItem.setDate("31.08");
        itemArrayList.add(filmsItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("16:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(1));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("18:30");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(4));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("21:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(6));
        itemArrayList.add(seancesSubItem);

        filmsItem = new FilmsItem();//29
        filmsItem.setDate("02.09");
        itemArrayList.add(filmsItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("15:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(7));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("16:45");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(1));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("19:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(6));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("20:45");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(4));
        itemArrayList.add(seancesSubItem);

        filmsItem = new FilmsItem();//34
        filmsItem.setDate("03:09");
        itemArrayList.add(filmsItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("15:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(7));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("16:45");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(1));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("19:00");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(6));
        itemArrayList.add(seancesSubItem);

        seancesSubItem = new SeancesSubItem();
        seancesSubItem.setTime("20:45");
        seancesSubItem.setFilm(utils.getFilmArrayList().get(4));
        itemArrayList.add(seancesSubItem);

        FilmsRecyclerViewAdapter filmsRecyclerViewAdapter = new FilmsRecyclerViewAdapter(itemArrayList);
        recyclerView.setAdapter(filmsRecyclerViewAdapter);

        return recyclerView;
    }

}
