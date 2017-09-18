package dev.barmaglot.com.mdg_cinema.expandable;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Title extends ExpandableGroup<SubTitle> {


    public Title(String title, List<SubTitle> items) {
        super(title, items);
    }

}

