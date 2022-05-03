package com.example.musicag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    //botones de generos
    Button rock;
    Button salsa;
    Button romanticas;
    Button huayno;
    Button bachata;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //SALSA
        salsa = findViewById(R.id.btnsalsa);
        salsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarSalsa();
            }
        });

        //ROCK
        rock= findViewById(R.id.btnrock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarRock();
            }
        });

        //ROMANTICAS
        romanticas= findViewById(R.id.btnromanticas);
        romanticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarRomanticas();
            }
        });


        //Bachata
        bachata = findViewById(R.id.btnbachata);
        bachata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarBachata();
            }
        });


        //HUAYNO
        huayno= findViewById(R.id.btnhuayno);
        huayno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarHuayno();
            }
        });


    }


    //LLAMARSALSA
    private void LlamarSalsa(){
        Intent intent = new Intent(menu.this,Salsa.class);
        startActivity(intent);
    }

    //LLAMARROCK
    private void LlamarRomanticas(){
        Intent intent = new Intent(menu.this,Romanticas.class);
        startActivity(intent);
    }

    //LLAMARROCK
    private void LlamarRock(){
        Intent intent = new Intent(menu.this,Rock.class);
        startActivity(intent);
    }

    //LLELECTRO
    private void LlamarBachata(){
        Intent intent = new Intent(menu.this,Bachata.class);
        startActivity(intent);
    }
    //LLAMARHUAYNO
    private void LlamarHuayno(){
        Intent intent = new Intent(menu.this,Huayno.class);
        startActivity(intent);
    }



}