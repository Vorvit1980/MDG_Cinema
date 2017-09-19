package dev.barmaglot.com.mdg_cinema.example;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import dev.barmaglot.com.mdg_cinema.R;

/**
 * Created by vorvit1980 on 19.09.2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Object> itemArrayList = null;

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_SUB_ITEM = 1;

    public RecyclerViewAdapter(ArrayList<Object> itemArrayList) {
        this.itemArrayList = itemArrayList;

    }

    @Override
    public int getItemViewType(int position) {
        int nType = TYPE_SUB_ITEM;
        if (position == 0 || position == 3) {
            nType = TYPE_ITEM;
        }
        return nType;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder itemHolder = null;
        if (viewType == TYPE_ITEM) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_item, parent, false);
            itemHolder = new ItemHolder(v);
        } else if (viewType == TYPE_SUB_ITEM) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_sub_item, parent, false);
            itemHolder = new SubItemHolder(v);
        }
        return itemHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int nType = getItemViewType(position);
        if (nType == TYPE_ITEM) {
            Item item = (Item) itemArrayList.get(position);
            ItemHolder itemHolder = (ItemHolder) holder;
            itemHolder.tvDate.setText(item.getDate());
        }else if (nType == TYPE_SUB_ITEM){
            SubItem subItem = (SubItem)itemArrayList.get(position);
            SubItemHolder subItemHolder = (SubItemHolder) holder;
            subItemHolder.subItemTime.setText(subItem.getTime());
            subItemHolder.subItemName.setText(subItem.getName());
        }

    }

    @Override
    public int getItemCount() {
        Log.d("MyLog", "Size: " + String.valueOf(itemArrayList.size()));
        return itemArrayList.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {

        TextView tvDate = null;

        public ItemHolder(View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.item_date);
        }
    }

    public class SubItemHolder extends RecyclerView.ViewHolder {

        TextView subItemName = null;
        TextView subItemTime = null;

        public SubItemHolder(View itemView) {
            super(itemView);
            subItemName = itemView.findViewById(R.id.sub_item_name);
            subItemTime = itemView.findViewById(R.id.sub_item_time);

        }
    }

}
