package com.example.dagger2_java;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent {

   //constructor injection
   Car getCar();

   //variable injection
   void inject(MainActivity mainActivity);
}
