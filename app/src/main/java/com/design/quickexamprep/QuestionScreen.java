package com.design.quickexamprep;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

public class QuestionScreen extends AppCompatActivity {

    Activity activity = QuestionScreen.this;
    DrawerLayout drawer_layout;
    ActionBarDrawerToggle drawerToggle;

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
    }

    private void showTestCompleteDialog() {
        new MaterialAlertDialogBuilder(activity)
                .setView(LayoutInflater.from(activity)
                        .inflate(R.layout.exam_completion_popup, null)).show();
    }
}