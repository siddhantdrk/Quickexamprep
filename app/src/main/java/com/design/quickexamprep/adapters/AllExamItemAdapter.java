package com.design.quickexamprep.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.R;

public class AllExamItemAdapter extends
        RecyclerView.Adapter<AllExamItemAdapter.ViewHolder> {

    private final Context context;

    public AllExamItemAdapter(Context context) {
        this.context = context;
    }

    @Override
    public AllExamItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_all_exams, parent, false);
        return new ViewHolder(view);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(AllExamItemAdapter.ViewHolder holder, int position) {

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {

            super(itemView);

        }
    }
}