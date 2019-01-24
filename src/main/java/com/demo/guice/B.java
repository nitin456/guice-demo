package com.demo.guice;

import javax.inject.Inject;

public class B implements IB{
    private String name;
    private long count;
    private IA obj;

    @Inject
    public B(IA obj) {
        this.obj = obj;
        this.name = "B";
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
