package io.zipcoder;

import com.sun.applet2.AppletParameters;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.io.Console;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class Application {
    private static LinkedHashMap<String, String> animalAndName = new LinkedHashMap<>();

    public static void main(String[] args){
        recordNames();
        printListOfRespectivePetSounds();
    }

    public static void addToAnimalAndName(String animal, String name) {
        animalAndName.put(animal, name);
    }

    public static void printListOfRespectivePetSounds() {
        for (String animal : animalAndName.keySet()) {
            if (animal.toLowerCase().equals("dog")) {
                System.out.println(animalAndName.get(animal) +" says " + Dog.speak());
            } else if (animal.toLowerCase().equals("cat")) {
                System.out.println(animalAndName.get(animal) + " says " + Cat.speak());
            } else if (animal.toLowerCase().equals("bird")) {
                System.out.println(animalAndName.get(animal) + " says" + Dog.speak());
            }
        }
    }

    public static void recordNames() {
            System.out.println("How many pets do you have?");
            Scanner input = new Scanner(System.in);
            Integer howManyPets = Integer.parseInt(input.nextLine());
            for (int i = 0; i < howManyPets; i++) {
                System.out.println("Give the name of a pet.");
                String name = input.nextLine();
                System.out.println("What kind of animal is " + name + "?");
                String animal = input.nextLine();
                Application.addToAnimalAndName(animal, name);
            }
        }


    public LinkedHashMap<String, String> getAnimalAndName() {
        return animalAndName;
    }

    public static void setAnimalAndName(LinkedHashMap<String, String> animalAndName) {
        Application.animalAndName = animalAndName;
    }
}
