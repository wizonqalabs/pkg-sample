package com.github.wizonqalabs.web;

public class Addition {
    private final int a;
    private final int b;

    public Addition (final int a, final int b) {
        this.a = a;
        this.b = b;
    }

    public int sum () {
        return this.a + this.b;
    }
}
