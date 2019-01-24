package com.demo.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppModule());
        A objA = injector.getInstance(A.class);
        B objB = injector.getInstance(B.class);
        System.out.println(objA.getName());
        System.out.println(objB.getName());
    }
}
