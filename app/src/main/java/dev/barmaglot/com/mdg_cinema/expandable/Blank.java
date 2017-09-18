package dev.barmaglot.com.mdg_cinema.expandable;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import dev.barmaglot.com.mdg_cinema.R;

public class Blank extends Fragment {

    String names[] = Constant.name;
    String subNames[] = Constant.subName;


    public Blank() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.recycler_view,container,false);

        List<Title> list = getList();
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return recyclerView;
    }

    private List<Title> getList() {
        List<Title> list = new ArrayList<>();// создаем свой список
        for (int i = 0; i < names.length; i++) {
            List<SubTitle> subTitles = new ArrayList<>();
            for (int j = 0; j< subNames.length; j++){
                SubTitle subTitle = new SubTitle(subNames[j]);
                subTitles.add(subTitle);
            }
            Title model = new Title(names[i],subTitles);
            list.add(model);
        }
        return list;
    }

}
