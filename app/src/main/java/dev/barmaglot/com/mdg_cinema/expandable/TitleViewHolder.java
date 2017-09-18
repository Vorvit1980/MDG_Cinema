package dev.barmaglot.com.mdg_cinema.expandable;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import dev.barmaglot.com.mdg_cinema.DetailActivity;
import dev.barmaglot.com.mdg_cinema.R;

public class TitleViewHolder extends GroupViewHolder {

    public ImageView picture;
    public TextView name;
    public TextView description;
    public TitleViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.item_card, parent, false));
        picture = itemView.findViewById(R.id.film_image);
        name = itemView.findViewById(R.id.card_title);
        description = itemView.findViewById(R.id.card_text);


    }
}