package com.example.a2048game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    Button bouton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bouton=findViewById(R.id.btnplay);

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.setText("La grosse daronne à Ewen");
            }
        });

        protected void CreaCase(LinearLayout layout){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){

                }
            }
        }
    }
}