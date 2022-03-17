package com.example.dagger2_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;
    @Inject
    Car car1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent=DaggerCarComponent.create();

        //constructor injection
       // car=carComponent.getCar();

        //field injection
        carComponent.inject(this);
        car.start();
        car1.start();
    }
}