package io.zipcoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat testCat = new Cat();

    @Test
    public void catSpeakTest(){
        String expected = "Meow";
        String actual = testCat.speak();

    }

}