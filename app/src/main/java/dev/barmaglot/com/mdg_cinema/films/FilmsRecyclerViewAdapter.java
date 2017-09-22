package dev.barmaglot.com.mdg_cinema.films;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import dev.barmaglot.com.mdg_cinema.DetailActivity;
import dev.barmaglot.com.mdg_cinema.Film;
import dev.barmaglot.com.mdg_cinema.R;

/**
 * Created by vorvit1980 on 19.09.2017.
 */

public class FilmsRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Film> itemArrayList = null;

    public FilmsRecyclerViewAdapter(ArrayList<Film> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder itemHolder = null;
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
            itemHolder = new ItemHolder(v);

        return itemHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemHolder itemHolder = (ItemHolder) holder;
        itemHolder.filmName.setText(itemArrayList.get(position).getFilmName());
        itemHolder.filmDuration.setText(String.valueOf(itemArrayList.get(position).getFilmDuration())+" мин");
        itemHolder.filmAge.setText(String.valueOf(itemArrayList.get(position).getSeanceList().get(0).getAge())+"+");
    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {

        TextView filmName = null;
        TextView filmDuration = null;
        TextView filmAge;


        public ItemHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("position",getPosition());
                    context.startActivity(intent);
                }
            });

            filmName = itemView.findViewById(R.id.card_title);
            filmDuration = itemView.findViewById(R.id.card_text);
            filmAge = itemView.findViewById(R.id.favorite_button);
        }
    }

}
