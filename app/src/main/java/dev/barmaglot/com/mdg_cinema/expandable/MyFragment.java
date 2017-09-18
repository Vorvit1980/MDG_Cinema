package dev.barmaglot.com.mdg_cinema.expandable;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import java.util.List;

import dev.barmaglot.com.mdg_cinema.Film;
import dev.barmaglot.com.mdg_cinema.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    private List<Film> allFilms;

    private String[] filmNames, filmDescriptions;


    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.recycler_view,container,false);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return recyclerView;
    }



}
