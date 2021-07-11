package com.design.quickexamprep.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.R;

public class MockTestItemAdapter extends
        RecyclerView.Adapter<MockTestItemAdapter.ViewHolder> {

    private final Context context;

    public MockTestItemAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MockTestItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mock_test_item, parent, false);
        return new MockTestItemAdapter.ViewHolder(view);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(MockTestItemAdapter.ViewHolder holder, int position) {

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
