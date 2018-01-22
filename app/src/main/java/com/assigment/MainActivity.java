package com.assigment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.toString();
    private int mLayoutContentPage;
    private Fragment fragment;
    private FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // init layout
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        mLayoutContentPage = R.id.main_content_layout;  // get the activity parent layout id to add fragment
        fragment = new SimpleAddition(); // create instance of SimpleAddition fragment
        fragmentManager.beginTransaction().add(mLayoutContentPage, fragment).commit(); // add fragment to layout
    }
}
