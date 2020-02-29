package io.zipcoder;

public class Pet {
    private String name = "";

    public static String speak(){
        return "Hello - this must come as a surprise to you, but I can speak.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
