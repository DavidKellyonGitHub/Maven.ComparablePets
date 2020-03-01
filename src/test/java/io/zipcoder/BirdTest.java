package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {
    Bird testBird = new Bird();

    @Test
    public void birdSpeakTest(){
        String expected = "Tweet!";
        String actual = testBird.speak();
        Assert.assertTrue(expected.equals(actual));
    }
}