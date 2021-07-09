package com.design.quickexamprep.adapters;

import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.R;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class QuestionOptionItemAdapter extends
        RecyclerView.Adapter<QuestionOptionItemAdapter.ViewHolder> {

    private final Activity context;
    int selectedPosition = 0;
    ArrayList<String> questions;

    public QuestionOptionItemAdapter(Activity context, ArrayList<String> questions) {
        this.context = context;
        this.questions = questions;
    }

    @NonNull
    @Override
    public QuestionOptionItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.question_options_item, parent, false);
        return new QuestionOptionItemAdapter.ViewHolder(view);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.cv_question_option.setOnClickListener(view -> {
            selectedPosition = position;
            notifyDataSetChanged();
        });

        if (position == selectedPosition) {
            holder.cv_question_option.setStrokeColor(ContextCompat.getColor(context, R.color.faint_primary_color));
            holder.tv_option.setTextColor(ContextCompat.getColor(context, R.color.faint_primary_color));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                holder.tv_option_no.setBackgroundTintList(context.getResources().getColorStateList(R.color.faint_primary_color));
            }
            holder.tv_option_no.setBackground(ContextCompat.getDrawable(context, R.drawable.circle));
            holder.tv_option_no.setTextColor(ContextCompat.getColor(context, R.color.white));
        } else {
            holder.cv_question_option.setStrokeColor(ContextCompat.getColor(context, R.color.white));
            holder.tv_option.setTextColor(ContextCompat.getColor(context, R.color.black));
            holder.tv_option_no.setBackgroundResource(R.drawable.cicrlewithoutline);
            holder.tv_option_no.setTextColor(ContextCompat.getColor(context, R.color.black));
        }
        holder.tv_option.setText(questions.get(position));
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        MaterialCardView cv_question_option;
        TextView tv_option, tv_option_no;

        public ViewHolder(View itemView) {
            super(itemView);

            cv_question_option = itemView.findViewById(R.id.cv_question_option);
            tv_option = itemView.findViewById(R.id.tv_option);
            tv_option_no = itemView.findViewById(R.id.tv_option_no);
        }
    }
}
