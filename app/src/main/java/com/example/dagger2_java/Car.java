package com.example.dagger2_java;

import android.util.Log;

import javax.inject.Inject;

import dagger.Module;


public class Car {

    private static final String TAG="CAR";

    @Inject
    Engine engine;
    private Wheels wheels;

    @Inject
    public Car( Wheels wheels) {
        Log.d(TAG,"CAR:Constructor");
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void passCarToRemote(Remote remote){
        Log.d(TAG,"passCarToRemote:Method");
        remote.setCar(this);
    }

    public void start(){
        engine.start();
        Log.d(TAG,"driving.....");
    }
}
