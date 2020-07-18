package com.example.uas_afif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuActivity extends AppCompatActivity {

    ImageButton btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn1=(ImageButton)findViewById(R.id.btn1);
        btn2=(ImageButton)findViewById(R.id.btn2);
        btn3=(ImageButton)findViewById(R.id.btn3);
        btn4=(ImageButton)findViewById(R.id.btn4);


        ImageButton imageButton = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), alquranActivity.class);
                startActivity(activity2Intent);
            }
        });

        ImageButton imageButton1 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), doaActivity.class);
                startActivity(activity2Intent);
            }
        });

        ImageButton imageButton2 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), jadwalActivity.class);
                startActivity(activity2Intent);
            }
        });

        ImageButton imageButton3 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), sholawatActivity.class);
                startActivity(activity2Intent);
            }
        });


    }
}
