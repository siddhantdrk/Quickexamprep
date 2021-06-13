package com.design.quickexamprep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuestionScreen extends AppCompatActivity {

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
    }
}