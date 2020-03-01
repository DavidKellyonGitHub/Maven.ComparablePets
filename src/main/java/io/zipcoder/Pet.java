package io.zipcoder;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public abstract class Pet implements Comparable, Comparator {
    private String name = "";
    private Integer foodChainPosition = 0;

    public static String speak() {
        return "Hello - this must come as a surprise to you, but I can speak.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Pet o) {
        return o.getFoodChainPosition() - this.getFoodChainPosition();
    }


    public static int compare(Pet o1, Pet o2) {
        if (o1.getFoodChainPosition() > o2.getFoodChainPosition()) return 1;
        if (o1.getFoodChainPosition() < o2.getFoodChainPosition()) return -1;
        return 0;
    }

    public Integer getFoodChainPosition() {
        return foodChainPosition;
    }

    public void setFoodChainPosition(Integer foodChainPosition) {
        this.foodChainPosition = foodChainPosition;
    }
}