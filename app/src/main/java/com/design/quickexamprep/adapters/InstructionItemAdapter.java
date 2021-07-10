package com.design.quickexamprep.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.R;

import java.util.ArrayList;

public class InstructionItemAdapter extends
        RecyclerView.Adapter<InstructionItemAdapter.ViewHolder> {

    private final Context context;
    ArrayList<String> instruction = new ArrayList<>();

    public InstructionItemAdapter(Context context) {
        this.context = context;
        instruction.add("દરેક પ્રશ્ન એક ગુણનો છે");
        instruction.add("સાચા જવાબની એક ગુણ મળશે જ્યારે ખોટા જવાબ ના 0.25 ગુણ કપાસે");
        instruction.add("જો તમે કોઈ પ્રશ્નનો જવાબ ના આપવા માંગતા હોવ તો ઓપ્શન સિલેક્ટ કરવ");
        instruction.add("ઓપ્શન ઈ સિલેક્ટ કરવાથી નેગેટિવ ગુણ કપાસ નહીં");
        instruction.add("જો તમે વચ્ચેથી એક્ઝામ સબમીટ કરવા માગતા હોવ તો submit બટન દબાવો");
        instruction.add("જો તમે કોઈ પ્રશ્નનો જવાબ પાછળથી આપવા માગતા હો તો તમે તે પ્રશ્નને mark for");
        instruction.add("Mark for review કરેલા પ્રશ્નો તમને લાલ કલરથી highlighted જોવા મળશે");
        instruction.add("તમે કોઈપણ પ્રશ્ન ઉપર સીધા જઈ શકો છો તેના માટે પ્રશ્ન નંબર ઉપર ક્લિક કરતા તમે તે પ્રશ્ન ઉપર જઈ શકો છો");
    }

    @Override
    public InstructionItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.instruction_item, parent, false);
        return new InstructionItemAdapter.ViewHolder(view);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(InstructionItemAdapter.ViewHolder holder, int position) {

        ((TextView) holder.itemView.findViewById(R.id.tv_instruction_point)).setText(instruction.get(position));
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return instruction.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {

            super(itemView);

        }
    }
}
