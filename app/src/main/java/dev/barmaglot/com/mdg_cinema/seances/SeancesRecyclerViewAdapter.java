package dev.barmaglot.com.mdg_cinema.seances;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import dev.barmaglot.com.mdg_cinema.DetailActivity;
import dev.barmaglot.com.mdg_cinema.R;

/**
 * Created by vorvit1980 on 19.09.2017.
 */

public class SeancesRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Object> itemArrayList = null;

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_SUB_ITEM = 1;

    public SeancesRecyclerViewAdapter(ArrayList<Object> itemArrayList) {
        this.itemArrayList = itemArrayList;

    }

    @Override
    public int getItemViewType(int position) {
        int nType = TYPE_SUB_ITEM;
        if (position == 0 || position == 5 || position == 10 || position == 15 || position == 20 ||
                position == 25 || position == 29 || position == 34) {
            nType = TYPE_ITEM;
        }
        return nType;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder itemHolder = null;
        if (viewType == TYPE_ITEM) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.seances_item, parent, false);
            itemHolder = new ItemHolder(v);
        } else if (viewType == TYPE_SUB_ITEM) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.seances_sub_item, parent, false);
            itemHolder = new SubItemHolder(v);
        }
        return itemHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int nType = getItemViewType(position);
        if (nType == TYPE_ITEM) {
            SeancesItem seancesItem = (SeancesItem) itemArrayList.get(position);
            ItemHolder itemHolder = (ItemHolder) holder;
            itemHolder.itemDate.setText(seancesItem.getDate());
        } else if (nType == TYPE_SUB_ITEM) {
            SeancesSubItem seancesSubItem = (SeancesSubItem) itemArrayList.get(position);
            SubItemHolder subItemHolder = (SubItemHolder) holder;
            subItemHolder.subItemTime.setText(seancesSubItem.getTime());
            subItemHolder.subItemName.setText(seancesSubItem.getFilm().getFilmName());
            subItemHolder.subItemPrice.setText(String.valueOf(seancesSubItem.getFilm().getSeanceList().get(0).getPrice())+"p");
        }

    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {

        TextView itemDate = null;

        public ItemHolder(View itemView) {
            super(itemView);
            itemDate = itemView.findViewById(R.id.item_date);
        }
    }

    public class SubItemHolder extends RecyclerView.ViewHolder {

        TextView subItemName = null;
        TextView subItemTime = null;
        TextView subItemPrice = null;

        public SubItemHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, DetailActivity.class);
                    context.startActivity(intent);
                }
            });

            subItemName = itemView.findViewById(R.id.sub_item_name);
            subItemTime = itemView.findViewById(R.id.sub_item_time);
            subItemPrice = itemView.findViewById(R.id.sub_item_price);

        }
    }

}
