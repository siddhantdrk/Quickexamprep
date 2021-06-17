package com.design.quickexamprep;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

public class QuestionScreen extends AppCompatActivity {

    Activity activity = QuestionScreen.this;
    DrawerLayout drawer_layout;
    ActionBarDrawerToggle drawerToggle;
    RecyclerView rv_drawer_question_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

        drawer_layout = findViewById(R.id.drawer_layout);
        drawer_layout.setDrawerListener(drawerToggle);

        drawerToggle = new ActionBarDrawerToggle(this, drawer_layout,
                null, R.string.app_name, R.string.app_name);
        //This is necessary to change the icon of the Drawer Toggle upon state change.
        drawerToggle.syncState();

        findViewById(R.id.iv_drawer).setOnClickListener(view -> {
            drawer_layout.openDrawer(Gravity.RIGHT);
        });

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("મુઝફ્ફર ખાનને");
        arrayList.add("મહંમદ ઘોરીને");
        arrayList.add("અલાઉદ્દીન ખિલજીને");
        arrayList.add("અહમદશાહને");
        arrayList.add("Not Attempted");

        RecyclerView rv_questions_option = findViewById(R.id.rv_questions_option);
        QuestionOptionItemAdapter questionOptionItemAdapter = new QuestionOptionItemAdapter(QuestionScreen.this, arrayList);
        rv_questions_option.setLayoutManager(new LinearLayoutManager(QuestionScreen.this));
        rv_questions_option.setAdapter(questionOptionItemAdapter);

        findViewById(R.id.mb_submit_test).setOnClickListener(view -> {
            showTestCompleteDialog();

        });

        rv_drawer_question_no = findViewById(R.id.rv_drawer_question_no);
        DrawerQuestionNo drawerQuestionNo = new DrawerQuestionNo(this);
        rv_drawer_question_no.setLayoutManager(new GridLayoutManager(this, 5));
        rv_drawer_question_no.setAdapter(drawerQuestionNo);

    }

    private void showTestCompleteDialog() {
        new MaterialAlertDialogBuilder(activity)
                .setView(LayoutInflater.from(activity)
                        .inflate(R.layout.exam_completion_popup, null)).show();
    }

    class DrawerQuestionNo extends
            RecyclerView.Adapter<DrawerQuestionNo.ViewHolder> {

        private final Context context;

        DrawerQuestionNo(Context context) {
            this.context = context;
        }

        @Override
        public DrawerQuestionNo.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.drawer_question_count, parent, false);
            return new DrawerQuestionNo.ViewHolder(view);
        }

        // Involves populating data into the item through holder
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            if (position == 0) {
                ((TextView) holder.itemView.findViewById(R.id.tv_drawer_question_count)).setBackground(ContextCompat.getDrawable(context, R.drawable.circle));
                holder.itemView.findViewById(R.id.iv_question_marked).setVisibility(View.GONE);
            } else if (position == 1) {
                ((TextView) holder.itemView.findViewById(R.id.tv_drawer_question_count)).setBackground(ContextCompat.getDrawable(context, R.drawable.circle));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ((TextView) holder.itemView.findViewById(R.id.tv_drawer_question_count)).setBackgroundTintList(context.getResources().getColorStateList(R.color.teal_200));
                }

                holder.itemView.findViewById(R.id.iv_question_marked).setVisibility(View.GONE);
            } else if (position == 3) {
                ((TextView) holder.itemView.findViewById(R.id.tv_drawer_question_count)).setBackground(ContextCompat.getDrawable(context, R.drawable.circle));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ((TextView) holder.itemView.findViewById(R.id.tv_drawer_question_count)).setBackgroundTintList(context.getResources().getColorStateList(R.color.teal_200));
                }
                holder.itemView.findViewById(R.id.iv_question_marked).setVisibility(View.VISIBLE);
            } else {
                ((TextView) holder.itemView.findViewById(R.id.tv_drawer_question_count)).setBackgroundResource(R.drawable.cicrlewithoutline);
                holder.itemView.findViewById(R.id.iv_question_marked).setVisibility(View.GONE);
            }
            ((TextView) holder.itemView.findViewById(R.id.tv_drawer_question_count))
                    .setText("" + position);
        }

        // Returns the total count of items in the list
        @Override
        public int getItemCount() {
            return 35;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            public ViewHolder(View itemView) {

                super(itemView);

            }
        }
    }
}