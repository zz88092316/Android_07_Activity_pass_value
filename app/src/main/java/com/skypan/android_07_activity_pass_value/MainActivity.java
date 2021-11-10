package com.skypan.android_07_activity_pass_value;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText AText;
    private TextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AText = (EditText)findViewById(R.id.AText);
        word = (TextView)findViewById(R.id.word);
        Intent intent =this.getIntent();
        String AText = intent.getStringExtra("BText");
        word.setText(AText);
    }

    public void Switch(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        intent.putExtra("AText",AText.getText().toString());
        startActivity(intent);
        MainActivity.this.finish();
    }
}