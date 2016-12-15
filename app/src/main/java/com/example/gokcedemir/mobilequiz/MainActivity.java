package com.example.gokcedemir.mobilequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buton = (Button) findViewById(R.id.Btn);

        buton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText adText = (EditText) findViewById(R.id.adtextEdit);
                EditText soyadText = (EditText) findViewById(R.id.soyadtextEdit);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this,"Click it...",Toast.LENGTH_SHORT).show();

                String mesaj ="Merhaba"+ adText.getText().toString() + " " +
                soyadText.getText().toString() ;

                Toast.makeText(MainActivity.this, mesaj, Toast.LENGTH_SHORT).show();
            }
        });
    }
}