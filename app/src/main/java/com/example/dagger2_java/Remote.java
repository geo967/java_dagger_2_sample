package com.example.dagger2_java;

import javax.inject.Inject;

public class Remote {

    private Car car;

    @Inject
    public Remote(){

    }
    public void setCar(Car car){
        this.car=car;
    }
}
