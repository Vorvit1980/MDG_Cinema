package dev.barmaglot.com.mdg_cinema.films;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import dev.barmaglot.com.mdg_cinema.Film;
import dev.barmaglot.com.mdg_cinema.R;
import dev.barmaglot.com.mdg_cinema.Utils;
import dev.barmaglot.com.mdg_cinema.seances.SeancesSubItem;

public class FilmsFragment extends Fragment {

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

        ArrayList<Film> itemArrayList = utils.getFilmArrayList();

        FilmsRecyclerViewAdapter filmsRecyclerViewAdapter = new FilmsRecyclerViewAdapter(itemArrayList);
        recyclerView.setAdapter(filmsRecyclerViewAdapter);

        return recyclerView;
    }

}
