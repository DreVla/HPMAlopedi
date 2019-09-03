package com.hpmtutorial.hpmalopedi.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hpmtutorial.hpmalopedi.R;
import com.hpmtutorial.hpmalopedi.model.Child;
import com.hpmtutorial.hpmalopedi.model.Family;
import com.hpmtutorial.hpmalopedi.model.ItemType;

import org.w3c.dom.Text;

import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter {

    private List<ItemType> itemList;
    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ItemType item);
    }

    public ParentAdapter(List<ItemType> itemList, OnItemClickListener listener) {
        this.itemList = itemList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        switch (viewType) {
            case ItemType.TYPE_FAMILY:
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_family, parent, false);
                return new FamilyViewHolder(itemView);
            default: // TYPE_CHILD
                itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_child, parent, false);
                return new ChildViewHolder(itemView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case ItemType.TYPE_FAMILY:
                ((FamilyViewHolder) holder).bindView(position, listener);
                break;
            default: //TYPE_CHILD
                ((ChildViewHolder) holder).bindView(position, listener);
        }
    }

    @Override
    public int getItemCount() {
        if (itemList == null) {
            return 0;
        } else {
            return itemList.size();
        }
    }

    public int getItemViewType(int position) {
        return itemList.get(position).getType();
    }

    public void setItemList(List<ItemType> literatureList) {
        itemList = literatureList;
        notifyDataSetChanged();
    }

    public class ChildViewHolder extends RecyclerView.ViewHolder {

        TextView childNameTextView;
        FloatingActionButton callButton;

        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            childNameTextView = itemView.findViewById(R.id.child_item_name);
            callButton = itemView.findViewById(R.id.fab_call_child_item);
        }

        public void bindView(int position, final OnItemClickListener listener) {
            final Child child =(Child) itemList.get(position);
            childNameTextView.setText(child.getName());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(child);
                }
            });
        }
    }

    public class FamilyViewHolder extends RecyclerView.ViewHolder {

        TextView familyNameTextView;

        public FamilyViewHolder(@NonNull View itemView) {
            super(itemView);
            familyNameTextView = itemView.findViewById(R.id.item_family_name);
        }

        public void bindView(int position, final OnItemClickListener listener) {
            final Family family = (Family) itemList.get(position);
            familyNameTextView.setText(family.getIdFamily());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(family);
                }
            });
        }
    }
}
