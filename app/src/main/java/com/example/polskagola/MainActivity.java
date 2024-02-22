package com.example.polskagola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    int nrOdp;
    int podsumowanie;
    int iterator;
    Boolean koniec;

    ArrayList<PytaniaOdp> lista = new ArrayList<PytaniaOdp>();

    TextView textView;
    TextView textView2;
    Button button;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        /*PytaniaOdp py1 = new PytaniaOdp("Od czego zależy wytrwałość kaktusa na brak wody?", 1, "Od grubości kolców", "Od kształtu kaktusa", "Od wielkości kaktusa", "Woda", 3);
        PytaniaOdp py2 = new PytaniaOdp("Co jest przyczyną krzywicy?", 2, "Niedobór witaminy G", "Niedobór witaminy D", "Niedobór witaminy C", "Niedobór witaminy K", 2);
        PytaniaOdp py3 = new PytaniaOdp("Oleica fioletowa to gatunek?", 3, "Mięczaka", "Owada", "Rośliny", "Płaza", 2);
        PytaniaOdp py4 = new PytaniaOdp("Ile par żeber posiada człowiek?", 4, "12", "14", "8", "26", 1);
        PytaniaOdp py5 = new PytaniaOdp("Młotogłów wielkogłowy to największy nietoperz którego kontynentu?", 5, "Azja", "Australia", "Europa", "Afryka", 4);*/



        try {
            InputStream stream = openFileInput("pytania.txt");

            if (stream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(stream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line = "";

                while ((line = bufferedReader.readLine()) != null) {
                    textView.setText(line);
                }
                stream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        koniec = false;

        iterator = 0;

       /*lista.add(py1);
        lista.add(py2);
        lista.add(py3);
        lista.add(py4);
        lista.add(py5);*/

        // wypisywanie(iterator);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nrOdp = 1;
                if (nrOdp == lista.get(iterator).getPoprawinaOdpowiedz()) {
                    podsumowanie++;
                }
                if (iterator == lista.size() - 1) {
                    koniec = true;
                    podsumowanie();
                }
                if (koniec == false) {
                    iterator++;
                    wypisywanie(iterator);
                    Toast.makeText(MainActivity.this, String.valueOf(iterator), Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nrOdp = 2;
                if (nrOdp == lista.get(iterator).getPoprawinaOdpowiedz()) {
                    podsumowanie++;
                }
                if (iterator == lista.size() - 1) {
                    koniec = true;
                    podsumowanie();
                }
                if (koniec == false) {
                    iterator++;
                    wypisywanie(iterator);
                    Toast.makeText(MainActivity.this, String.valueOf(iterator), Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nrOdp = 3;
                if (nrOdp == lista.get(iterator).getPoprawinaOdpowiedz()) {
                    podsumowanie++;
                }
                if (iterator == lista.size() - 1) {
                    koniec = true;
                    podsumowanie();
                }
                if (koniec == false) {

                    iterator++;
                    wypisywanie(iterator);
                    Toast.makeText(MainActivity.this, String.valueOf(iterator), Toast.LENGTH_SHORT).show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nrOdp = 4;
                if (nrOdp == lista.get(iterator).getPoprawinaOdpowiedz()) {
                    podsumowanie++;
                }
                if (iterator == lista.size() - 1) {
                    koniec = true;
                    podsumowanie();
                }
                if (koniec == false) {

                    iterator++;
                    wypisywanie(iterator);
                    Toast.makeText(MainActivity.this, String.valueOf(iterator), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void wypisywanie(int iterator) {
        PytaniaOdp pytanko = lista.get(iterator);
        textView.setText("Pytanie nr " + pytanko.getNrPytania());
        textView2.setText(pytanko.getPytanie());
        button.setText(pytanko.getOdpowiedz());
        button2.setText(pytanko.getOdpowiedz2());
        button3.setText(pytanko.getOdpowiedz3());
        button4.setText(pytanko.getOdpowiedz4());
    }

    public void podsumowanie() {
        textView.setText("Podsumowanie");
        button.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);
        button4.setVisibility(View.GONE);
        textView2.setText("Odpowiedziałeś na " + podsumowanie + " z " + lista.size() + " pytań");
    }
}