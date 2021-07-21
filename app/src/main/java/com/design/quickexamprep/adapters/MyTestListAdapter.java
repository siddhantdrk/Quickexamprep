package com.design.quickexamprep.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.R;

import java.util.ArrayList;

public class MyTestListAdapter extends
        RecyclerView.Adapter<com.design.quickexamprep.adapters.MyTestListAdapter.ViewHolder> {

    private final Context context;
    ArrayList<String> titlelist;

    public MyTestListAdapter(Context context, ArrayList<String> titlelist) {
        this.context = context;
        this.titlelist = titlelist;
    }

    @Override
    public MyTestListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_test_list_item, parent, false);
        return new com.design.quickexamprep.adapters.MyTestListAdapter.ViewHolder(view);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(com.design.quickexamprep.adapters.MyTestListAdapter.ViewHolder holder, int position) {

        holder.tv_test_title.setText(titlelist.get(position));

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return titlelist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_test_title;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_test_title = itemView.findViewById(R.id.tv_test_title);
        }
    }
}