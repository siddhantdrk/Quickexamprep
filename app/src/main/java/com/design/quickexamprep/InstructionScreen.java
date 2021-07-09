package com.design.quickexamprep;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.design.quickexamprep.adapters.InstructionItemAdapter;

public class InstructionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_screen);

        RecyclerView rv_instructions = findViewById(R.id.rv_instructions);
        rv_instructions.setLayoutManager(new LinearLayoutManager(InstructionScreen.this));
        InstructionItemAdapter instructionItemAdapter = new InstructionItemAdapter(InstructionScreen.this);
        rv_instructions.setAdapter(instructionItemAdapter);
    }
}