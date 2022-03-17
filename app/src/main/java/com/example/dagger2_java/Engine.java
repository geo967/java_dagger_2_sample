package com.example.dagger2_java;

import android.util.Log;

import javax.inject.Inject;

import dagger.assisted.AssistedInject;
import dagger.internal.InjectedFieldSignature;

public class Engine {

    private static final String TAG="CAR";
    @Inject
    public Engine(){

    }

    public void start(){
        Log.d(TAG,"Engine started...");
    }
}
