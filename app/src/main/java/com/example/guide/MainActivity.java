package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedtopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // айдишники
        final LinearLayout theory = findViewById(R.id.theory);
        final LinearLayout practic = findViewById(R.id.practic);
        final LinearLayout info_about_me = findViewById(R.id.info_about_me);
        final LinearLayout pravila = findViewById(R.id.pravila);

        final Button startquiz = findViewById(R.id.startquiz);


        theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Меняем цвет кнопке, которую выбрали, а остальные оставляем в покое
                selectedtopic = "theory";
                theory.setBackgroundResource(R.drawable.round_back_white10);

                practic.setBackgroundResource(R.drawable.back_start);
                info_about_me.setBackgroundResource(R.drawable.back_start);
                pravila.setBackgroundResource(R.drawable.back_start);

            }
        });

        practic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Меняем цвет кнопке, которую выбрали, а остальные оставляем в покое
                selectedtopic = "practic";
                practic.setBackgroundResource(R.drawable.round_back_white10);

                theory.setBackgroundResource(R.drawable.back_start);
                info_about_me.setBackgroundResource(R.drawable.back_start);
                pravila.setBackgroundResource(R.drawable.back_start);

            }
        });

        info_about_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Меняем цвет кнопке, которую выбрали, а остальные оставляем в покое
                selectedtopic = "info_about_me";
                info_about_me.setBackgroundResource(R.drawable.round_back_white10);

                practic.setBackgroundResource(R.drawable.back_start);
                theory.setBackgroundResource(R.drawable.back_start);
                pravila.setBackgroundResource(R.drawable.back_start);

            }
        });

        pravila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Меняем цвет кнопке, которую выбрали, а остальные оставляем в покое
                selectedtopic = "pravila";
                pravila.setBackgroundResource(R.drawable.round_back_white10);

                practic.setBackgroundResource(R.drawable.back_start);
                info_about_me.setBackgroundResource(R.drawable.back_start);
                theory.setBackgroundResource(R.drawable.back_start);

            }
        });

        startquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedtopic.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Выберите раздел", Toast.LENGTH_SHORT).show();

                } else {
                    if (selectedtopic == "practic"){
                        Intent intent = new Intent(MainActivity.this, Practic.class);
                        intent.putExtra("selectedtopic", selectedtopic);
                        startActivity(intent);
                        finish();
                    }
                    if (selectedtopic == "theory") {
                            Intent intent = new Intent(MainActivity.this, Theory.class);
                            intent.putExtra("selectedtopic", selectedtopic);
                            startActivity(intent);
                            finish();
                        }
                    if (selectedtopic == "info_about_me") {
                        Intent intent = new Intent(MainActivity.this, Info_About_Me.class);
                        intent.putExtra("selectedtopic", selectedtopic);
                        startActivity(intent);
                        finish();
                    }
                    if (selectedtopic == "pravila") {
                        Intent intent = new Intent(MainActivity.this, Pravila.class);
                        intent.putExtra("selectedtopic", selectedtopic);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
    }
}