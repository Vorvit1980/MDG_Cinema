package dev.barmaglot.com.mdg_cinema.example;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import dev.barmaglot.com.mdg_cinema.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewFragment extends Fragment {

    private Item item = null;
    private SubItem subItem = null;

    public NewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(
                R.layout.recycler_view, container, false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Object> itemArrayList = new ArrayList<>();

        item = new Item();
        item.setDate("24.10");
        itemArrayList.add(item);

        subItem = new SubItem();
        subItem.setTime("15:00");
        subItem.setName("Film 1");
        itemArrayList.add(subItem);

        subItem = new SubItem();
        subItem.setTime("16:00");
        subItem.setName("Film 2");
        itemArrayList.add(subItem);

        item = new Item();
        item.setDate("25.10");
        itemArrayList.add(item);

        subItem = new SubItem();
        subItem.setName("Film 3");
        subItem.setTime("14:00");
        itemArrayList.add(subItem);

        subItem = new SubItem();
        subItem.setName("Film 4");
        subItem.setTime("16:00");
        itemArrayList.add(subItem);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(itemArrayList);
        recyclerView.setAdapter(recyclerViewAdapter);

        return recyclerView;
    }

}
