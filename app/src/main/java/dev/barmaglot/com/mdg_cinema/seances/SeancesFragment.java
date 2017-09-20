package dev.barmaglot.com.mdg_cinema.seances;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class SeancesFragment extends Fragment {

    private SeancesItem seancesItem = null;
    private SeancesSubItem seancesSubItem = null;
    private Utils utils;

    public SeancesFragment() {
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

        seancesItem = new SeancesItem();//0
        seancesItem.setDate("22.08");
        itemArrayList.add(seancesItem);

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

        seancesItem = new SeancesItem();//5
        seancesItem.setDate("24.08");
        itemArrayList.add(seancesItem);

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

        seancesItem = new SeancesItem();//10
        seancesItem.setDate("26.08");
        itemArrayList.add(seancesItem);

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

        seancesItem = new SeancesItem();//15
        seancesItem.setDate("27.08");
        itemArrayList.add(seancesItem);

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

        seancesItem = new SeancesItem();//20
        seancesItem.setDate("29.08");
        itemArrayList.add(seancesItem);

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

        seancesItem = new SeancesItem();//25
        seancesItem.setDate("31.08");
        itemArrayList.add(seancesItem);

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

        seancesItem = new SeancesItem();//29
        seancesItem.setDate("02.09");
        itemArrayList.add(seancesItem);

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

        seancesItem = new SeancesItem();//34
        seancesItem.setDate("03:09");
        itemArrayList.add(seancesItem);

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

        SeancesRecyclerViewAdapter seancesRecyclerViewAdapter = new SeancesRecyclerViewAdapter(itemArrayList);
        recyclerView.setAdapter(seancesRecyclerViewAdapter);

        return recyclerView;
    }

}
