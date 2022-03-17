package com.example.dagger2_java;

import javax.inject.Inject;

import dagger.assisted.AssistedInject;

public class Wheels {
    private Rims rims;
    private Tires tires;
    public Wheels(Rims rims,Tires tires){
    this.rims=rims;
    this.tires=tires;
    }
}
