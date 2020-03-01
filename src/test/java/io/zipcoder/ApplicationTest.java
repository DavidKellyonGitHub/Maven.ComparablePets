package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;

public class ApplicationTest {
    Application testApp = new Application();
    LinkedHashMap<String,String> testMap = new LinkedHashMap<>();


    @Test
    public void setGetAnimalAndNameTest(){
        testMap.put("Cat", "Kitty");
        testApp.setAnimalAndName(testMap);
        Assert.assertFalse(testApp.getAnimalAndName().isEmpty());
    }

    @Test
    public void addToAnimalAndNameTest(){
        testApp.addToAnimalAndName("Dog","Puppy");
        Assert.assertFalse(testApp.getAnimalAndName().isEmpty());
    }
}
