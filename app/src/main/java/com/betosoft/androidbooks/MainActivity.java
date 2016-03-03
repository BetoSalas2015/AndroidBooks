package com.betosoft.androidbooks;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements OnSelectBookChangeListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void OnSelectBookChanged(int bookIndex) {
        FragmentManager fragmentManager = getFragmentManager();
        BookDescFragment bookDescFragment = (BookDescFragment) fragmentManager.findFragmentById(R.id.fragmentDescription);
        if(bookDescFragment != null) bookDescFragment.setBook(bookIndex);

    }
}
