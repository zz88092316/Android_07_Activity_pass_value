package com.skypan.android_07_activity_pass_value;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText BText;
    private TextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BText = (EditText)findViewById(R.id.BText);
        word = (TextView)findViewById(R.id.word);
        Intent intent =this.getIntent();
        String AText = intent.getStringExtra("AText");
        word.setText(AText);
    }

    public void Switch(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this,MainActivity.class);
        intent.putExtra("BText",BText.getText().toString());
        startActivity(intent);
        MainActivity2.this.finish();
    }
}