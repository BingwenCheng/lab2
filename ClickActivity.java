package com.example.bingwencheng.magic8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
    }

    final String[] answer ={"yes","I would think so", "It is so","No","Not a chance","Never","mayber","I would rather not say"};

    public void answer(View view) {
        final TextView tv = (TextView) findViewById(R.id.textView3);
        int random_number = (int)(Math.random()*8);
        tv.setText(answer[random_number]);
//        Button Answer = (Button) findViewById(R.id.button);
//
//        Answer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }
}
