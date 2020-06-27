package com.github.wizonqalabs.web;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest {
    @Test
    public void testDriver () {
        final Addition add = new Addition (4, 5);
        Assert.assertEquals (add.sum (), 9);
    }
}