package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Practic extends AppCompatActivity {

    private String selectedtopicN = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practic);
        // айдишники
        final LinearLayout orfoep = findViewById(R.id.orfoep);
        final LinearLayout paronic = findViewById(R.id.paronic);

        final Button startquiz = findViewById(R.id.startquiz);




        orfoep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Меняем цвет кнопке, которую выбрали, а остальные оставляем в покое
                selectedtopicN = "orfoep";
                orfoep.setBackgroundResource(R.drawable.round_back_white10);

                paronic.setBackgroundResource(R.drawable.back_start);
            }
        });

        paronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Меняем цвет кнопке, которую выбрали, а остальные оставляем в покое
                selectedtopicN = "paronic";
                paronic.setBackgroundResource(R.drawable.round_back_white10);

                orfoep.setBackgroundResource(R.drawable.back_start);
            }
        });

        startquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedtopicN.isEmpty()) {
                    Toast.makeText(Practic.this, "Выберите раздел", Toast.LENGTH_SHORT).show();

                } else {
                    Intent intent = new Intent(Practic.this, PracticTest.class);
                    intent.putExtra("selectedtopicN", selectedtopicN);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }

}