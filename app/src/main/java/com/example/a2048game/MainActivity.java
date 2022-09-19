package com.example.a2048game;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayout myLayout;
    Button bouton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bouton = findViewById(R.id.btnplay);

        List<Button> casse=new ArrayList<>();
        casse.add(new Button(this));
        casse.add(new Button(this));
        casse.add(new Button(this));
        casse.add(new Button(this));

        GridView casse=findViewById(R.id.Grille);


       /* List<Cocktail_choix> cocktail_list = new ArrayList<>();
        cocktail_list.add(new Cocktail_choix("coktail_1", 2));
        cocktail_list.add(new Cocktail_choix("coktail_1", 2));
        cocktail_list.add(new Cocktail_choix("coktail_2", 3));
        cocktail_list.add(new Cocktail_choix("coktail_3", 4));

        GridView cocktailListView = findViewById(R.id.Grille);
        cocktailListView.setAdapter(new Cocktail_item_adapter(this, cocktail_list));*/

        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                TextView text= new TextView(this);
                text.setText("yo");
                text.setTextColor(getResources().getColor((R.color.purple_200)));
                text.setTextSize(25);
                myLayout.addView(text);*/

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.setText("La grosse daronne à Ewen");
            }
        });


    }
}



