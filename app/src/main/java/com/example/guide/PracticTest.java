package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PracticTest extends AppCompatActivity {

    private TextView question;
    private TextView quis;

    private AppCompatButton oneotvet, twootvet, threeotvet, foureotvet, fiveotvet;
    private AppCompatButton nextbtn;

    private final List<Bank> Bank = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);

        final String getselectedtopicN = getIntent().getStringExtra("selectedtopicN");

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView nameTopic = findViewById(R.id.nameTopic);

        question = findViewById(R.id.question);
        quis = findViewById(R.id.quis);

        oneotvet = findViewById(R.id.oneotvet);
        twootvet = findViewById(R.id.twootvet);
        threeotvet = findViewById(R.id.threeotvet);
        foureotvet = findViewById(R.id.foureotvet);
        fiveotvet = findViewById(R.id.fiveotvet);

        nextbtn = findViewById(R.id.nextbtn);

        nameTopic.setText(getselectedtopicN);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(PracticTest.this, MainActivity.class));
                finish();

            }
        });

        twootvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        threeotvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        foureotvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        fiveotvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        // переписать и вписать это куда-нить
        // Intent intent = new Intent(PracticTest.this, QuizRes1.class);
        // intent.putExtra("correct", getcorresctans());
        // intent.putExtra("incorrect", getincorresctans());


        // startActivity(intent);
        // finish();



    }
    private int getcorresctans () {

        int ceroctAns = 0;

        for (int i = 0; i < Bank.size(); i++){

            final String getUserSelAns = Bank.get(i).getUserSelAns();
            final String getAns = Bank.get(i).getAns();

            if (getUserSelAns.equals(getAns)) {
                ceroctAns ++;
            }

        }


        return ceroctAns;

    }

    private int getincorresctans () {

        int ceroctAns = 0;

        for (int i = 0; i < Bank.size(); i++){

            final String getUserSelAns = Bank.get(i).getUserSelAns();
            final String getAns = Bank.get(i).getAns();

            if (!getUserSelAns.equals(getAns)) {
                ceroctAns ++;
            }

        }


        return ceroctAns;

    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(PracticTest.this, MainActivity.class));
        finish();
    }
}