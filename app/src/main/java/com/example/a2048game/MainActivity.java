package com.example.a2048game;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout myLayout;
    Button bouton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bouton=findViewById(R.id.btnplay);

        /*for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ImageView view = new ImageView(this);
                ViewGroup.LayoutParams params = new ActionBar.LayoutParams(200,200);
                view.setLayoutParams(params);
                view.setBackgroundResource(R.drawable.ic_launcher_background);
                myLayout.addView(view);*/


                bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.setText("La grosse daronne à Ewen");
            }
        });



                }
            }

