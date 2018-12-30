package com.gaurav;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.
        Scanner scanner = new Scanner(System.in);

        System.out.println("====");

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("north", "n");
        vocabulary.put("east", "e");
        vocabulary.put("west", "w");
        vocabulary.put("south", "s");
        int loc = 64;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0){
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for (String exit: exits.keySet()){
                System.out.print(exit + ",");
            }
            System.out.println();
            String direction = scanner.nextLine();

            if (direction.length() > 1){
                for (String word : direction.split(" ")){
                    if (vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                    }
                }

            }

            if (exits.containsKey(direction)){
                loc=exits.get(direction);
            }else {
                System.out.println("yo cannot go to that direction");
            }

        }

    }
}
