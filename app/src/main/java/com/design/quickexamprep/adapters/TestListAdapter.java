package com.design.quickexamprep.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.R;

import java.util.ArrayList;

public class TestListAdapter extends
        RecyclerView.Adapter<TestListAdapter.ViewHolder> {

    private final Context context;
    ArrayList<String> titlelist;

    public TestListAdapter(Context context, ArrayList<String> titlelist) {
        this.context = context;
        this.titlelist = titlelist;
    }

    @Override
    public TestListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.testlist_item_layout, parent, false);
        return new TestListAdapter.ViewHolder(view);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(TestListAdapter.ViewHolder holder, int position) {

        holder.tv_test_title.setText(titlelist.get(position));

        if (position == 0) {
            holder.itemView.findViewById(R.id.mb_buy_now).setVisibility(View.GONE);
            holder.itemView.findViewById(R.id.mb_take_test).setVisibility(View.VISIBLE);
        } else {
            holder.itemView.findViewById(R.id.mb_buy_now).setVisibility(View.VISIBLE);
            holder.itemView.findViewById(R.id.mb_take_test).setVisibility(View.GONE);
        }
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
