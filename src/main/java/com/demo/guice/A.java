package com.demo.guice;

import javax.inject.Inject;

public class A implements IA {
    private String name;
    private long count;
    private IB obj;

    @Inject
    public A(IB obj) {
        this.obj = obj;
        this.name = "A";
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public void increase() {
        count += 1;
    }

    public long getCount() {
        return this.count;
    }
}
