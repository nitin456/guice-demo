package com.demo.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class AppModule extends AbstractModule{

    protected void configure() {
        bind(IA.class).to(A.class).in(Singleton.class);
        bind(IB.class).to(B.class).in(Singleton.class);
    }
}
