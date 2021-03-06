package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    Dog testPet = new Dog();
    Cat testCat = new Cat();
    Bird testBird = new Bird();

    @Test
    public void setGetNameTest() {
        testPet.setName("Alf");
        String expected = "Alf";
        String actual = testPet.getName();
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void petSpeakTest() {
        String expected = "Hello - this must come as a surprise to you, but I can speak.";
        String actual = testPet.speak();
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void petFoodChainComparableTest(){
        Integer expected = 1;
        Integer actual = testCat.compareTo(testBird);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void petFoodChainComparatorTest(){
        Integer expected = 1;
        Integer actual = Pet.compare(testPet,testCat);
    }
}