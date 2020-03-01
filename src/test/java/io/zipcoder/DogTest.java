package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog testDog = new Dog();
    @Test
    public void dogSpeakTest(){
        String expected = "Woof!";
        String actual = testDog.speak();
        Assert.assertTrue(expected.equals(actual));
    }

}