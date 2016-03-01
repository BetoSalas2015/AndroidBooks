package com.betosoft.androidbooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rdbAndroid6, rdbLearn, rdbEssential, rdbHeads;
    TextView txtDescrip;
    String Mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdbAndroid6 = (RadioButton) findViewById(R.id.rdbAndroid6);
        rdbHeads = (RadioButton) findViewById(R.id.rdbHeads);
        rdbLearn = (RadioButton) findViewById(R.id.rdbLearn);
        rdbEssential = (RadioButton) findViewById(R.id.rdbEsential);
        txtDescrip = (TextView) findViewById(R.id.txtDescrip);

        rdbHeads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDescrip.setText(R.string.android6Desc);
            }
        });
        rdbLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDescrip.setText(R.string.headsDEscrip);
            }
        });
        rdbEssential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDescrip.setText(R.string.introDesc);
            }
        });
        rdbAndroid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDescrip.setText(R.string.android6Desc);
            }
        });
    }




}
