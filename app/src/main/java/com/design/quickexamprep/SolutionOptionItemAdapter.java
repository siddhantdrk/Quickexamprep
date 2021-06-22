package com.design.quickexamprep;

import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class SolutionOptionItemAdapter extends
        RecyclerView.Adapter<SolutionOptionItemAdapter.ViewHolder> {

    private final Activity context;
    int selectedPosition = 0;
    ArrayList<String> questions;

    SolutionOptionItemAdapter(Activity context, ArrayList<String> questions) {
        this.context = context;
        this.questions = questions;
    }

    @NonNull
    @Override
    public SolutionOptionItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.question_options_item, parent, false);
        return new SolutionOptionItemAdapter.ViewHolder(view);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.cv_question_option.setOnClickListener(view -> {

        });

        if (position == selectedPosition) {
            holder.cv_question_option.setStrokeColor(ContextCompat.getColor(context, R.color.green));
            holder.tv_option.setTextColor(ContextCompat.getColor(context, R.color.green));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                holder.tv_option_no.setBackgroundTintList(context.getResources().getColorStateList(R.color.green));
            }
            holder.tv_option_no.setBackground(ContextCompat.getDrawable(context, R.drawable.circle));
            holder.tv_option_no.setTextColor(ContextCompat.getColor(context, R.color.white));
            holder.iv_question_result.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_baseline_done_24));
            holder.iv_question_result.setVisibility(View.VISIBLE);
            holder.cv_question_option.setCardBackgroundColor(context.getResources().getColor(R.color.faint_green_color));
        } else if (position == 3) {
            holder.cv_question_option.setStrokeColor(ContextCompat.getColor(context, R.color.red));
            holder.tv_option.setTextColor(ContextCompat.getColor(context, R.color.red));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                holder.tv_option_no.setBackgroundTintList(context.getResources().getColorStateList(R.color.red));
            }
            holder.tv_option_no.setBackground(ContextCompat.getDrawable(context, R.drawable.circle));
            holder.tv_option_no.setTextColor(ContextCompat.getColor(context, R.color.white));
            holder.iv_question_result.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_clear_red));
            holder.iv_question_result.setVisibility(View.VISIBLE);
            holder.cv_question_option.setCardBackgroundColor(context.getResources().getColor(R.color.faint_red));
        }else {
            holder.cv_question_option.setStrokeColor(ContextCompat.getColor(context, R.color.white));
            holder.tv_option.setTextColor(ContextCompat.getColor(context, R.color.black));
            holder.tv_option_no.setBackgroundResource(R.drawable.cicrlewithoutline);
            holder.tv_option_no.setTextColor(ContextCompat.getColor(context, R.color.black));
            holder.iv_question_result.setVisibility(View.GONE);
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
        ImageView iv_question_result;

        public ViewHolder(View itemView) {
            super(itemView);

            cv_question_option = itemView.findViewById(R.id.cv_question_option);
            tv_option = itemView.findViewById(R.id.tv_option);
            tv_option_no = itemView.findViewById(R.id.tv_option_no);
            iv_question_result = itemView.findViewById(R.id.iv_question_result);

        }
    }
}

