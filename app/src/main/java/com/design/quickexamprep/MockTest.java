package com.design.quickexamprep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.design.quickexamprep.adapters.AllExamItemAdapter;
import com.design.quickexamprep.adapters.MockTestItemAdapter;

public class MockTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_test);

        RecyclerView rv_mock_test = findViewById(R.id.rv_mock_test);
        MockTestItemAdapter allExamItemAdapter = new MockTestItemAdapter(MockTest.this);
        rv_mock_test.setAdapter(allExamItemAdapter);
        rv_mock_test.setLayoutManager(new LinearLayoutManager(MockTest.this));
    }
}