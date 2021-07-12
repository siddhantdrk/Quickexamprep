package com.design.quickexamprep.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.R;

import java.util.ArrayList;

public class MockTestItemAdapter extends
        RecyclerView.Adapter<MockTestItemAdapter.ViewHolder> {

    private final Context context;
    ArrayList<String> arrayList = new ArrayList<>();

    public MockTestItemAdapter(Context context) {
        this.context = context;
        arrayList.add("ગુજરાતનો ઇતિહાસ");
        arrayList.add("ગુજરાતની ભૂગોળ");
        arrayList.add("ભારતનો ઇતિહાસ");
        arrayList.add("ભારતની ભૂગોળ");
        arrayList.add("ભારતનું બંધારણ");
        arrayList.add("ગુજરાતી વ્યાકરણ");
        arrayList.add("અંગ્રેજી વ્યાકરણ");
        arrayList.add("કાયદો");
        arrayList.add("રમત ગમત");
        arrayList.add("સામાન્ય વિજ્ઞાન");
        arrayList.add("અંગ્રેજી વ્યાકરણ");
    }

    @Override
    public MockTestItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mock_test_item, parent, false);
        return new MockTestItemAdapter.ViewHolder(view);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(MockTestItemAdapter.ViewHolder holder, int position) {
        ((TextView) holder.itemView.findViewById(R.id.tv_test_name)).setText(arrayList.get(position));
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {

            super(itemView);

        }
    }
}
