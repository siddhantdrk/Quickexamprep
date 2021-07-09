package com.design.quickexamprep.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.R;

public class InstructionItemAdapter extends
        RecyclerView.Adapter<InstructionItemAdapter.ViewHolder> {

    private final Context context;

    public InstructionItemAdapter(Context context) {
        this.context = context;
    }

    @Override
    public InstructionItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.instruction_item, parent, false);
        return new InstructionItemAdapter.ViewHolder(view);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(InstructionItemAdapter.ViewHolder holder, int position) {

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {

            super(itemView);

        }
    }
}
