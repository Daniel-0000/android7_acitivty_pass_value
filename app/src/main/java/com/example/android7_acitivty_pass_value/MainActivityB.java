package com.example.android7_acitivty_pass_value;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);

        TextView messageB = (TextView)findViewById(R.id.messageB);
        Intent intent = this.getIntent();
        String ATOB = intent.getStringExtra("ATOB");
        messageB.setText("" + ATOB);
    }

    public void b_to_a(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivityB.this, MainActivity.class);
        EditText inputB = findViewById(R.id.input_B);
        intent.putExtra("BTOA",inputB.getText().toString()); // 記得put進去，不然資料不會帶過去哦
        startActivity(intent);
    }
}