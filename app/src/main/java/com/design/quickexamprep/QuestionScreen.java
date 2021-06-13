package com.design.quickexamprep;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

public class QuestionScreen extends AppCompatActivity {

    Activity activity = QuestionScreen.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

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