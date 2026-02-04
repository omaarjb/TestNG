package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void additionTest() {
        int result = 2 + 3;
        System.out.println("Running addition test");

        Assert.assertEquals(result, 5);
    }

    @Test
    public void failingTest() {
        System.out.println("Running failing test");

        Assert.assertEquals(10, 5);
    }
}
