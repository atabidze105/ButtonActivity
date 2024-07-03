package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mainTextView;
    Button mainButton;
    EditText mainEditText;
    ListView mainListView;
    ArrayAdapter mArrayAdapter;
    ArrayList mNameList = new ArrayList();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = (TextView) findViewById(R.id.main_textview);
        mainTextView.setText("Set in Java!");
        mainButton = (Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);
        mainListView = findViewById(R.id.main_listview);
        mArrayAdapter = new arrayAdapter(this, android.R.layout.simple_list_item_1, mNameList);
        mainListView.setAdapter(setAdapter(mArrayAdapter));

        mainEditText = (EditText) findViewById(R.id.main_edittext);
    }


    @Override
    public void onClick(View v) {
        mainTextView.setText("Button pressed");
        mainTextView.setText(mainEditText.getText().toString() + " is learning Android development!");
    }
}