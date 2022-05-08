package com.example.coursedataview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bsuccess,motivation,life,love,inspiration,automation,it,hr,finance,stress;
    String catno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bsuccess = findViewById(R.id.btnsuccess);

        bsuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "Sucess";
                intent.putExtra("catnokey",catno);
                startActivity(intent);
            }
        });


        motivation = findViewById(R.id.btnmotive);

        motivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "Motivation";
                intent.putExtra("catnokey",catno);
                startActivity(intent);

            }
        });

        life = findViewById(R.id.btnlife);

        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "Life";
                intent.putExtra("catnokey",catno);
                startActivity(intent);

            }
        });

        love = findViewById(R.id.btnlove);

        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "Love";
                intent.putExtra("catnokey",catno);
                startActivity(intent);

            }
        });

        inspiration = findViewById(R.id.btninspire);

        inspiration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "Inspiration";
                intent.putExtra("catnokey",catno);
                startActivity(intent);

            }
        });

        automation = findViewById(R.id.btnatuo);

        automation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "Automation";
                intent.putExtra("catnokey",catno);
                startActivity(intent);

            }
        });

        it = findViewById(R.id.btnit);

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "IT";
                intent.putExtra("catnokey",catno);
                startActivity(intent);

            }
        });

        hr = findViewById(R.id.btnhr);

        hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "HR";
                intent.putExtra("catnokey",catno);
                startActivity(intent);

            }
        });

        finance = findViewById(R.id.btnfinance);

        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "Finance";
                intent.putExtra("catnokey",catno);
                startActivity(intent);

            }
        });

        stress = findViewById(R.id.btnstress);

        stress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Reportform.class);
                catno = "Streess";
                intent.putExtra("catnokey",catno);
                startActivity(intent);

            }
        });




    }
}