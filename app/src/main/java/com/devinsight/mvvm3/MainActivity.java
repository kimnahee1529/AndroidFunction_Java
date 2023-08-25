package com.devinsight.mvvm3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.devinsight.mvvm3.Glide.PlaceFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new PlaceFragment())
                    .commit();
        }
    }
}
