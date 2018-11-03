package com.gaurav;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You sitting in front " +
                "of tv learning Java"));
        locations.put(1, new Location(1, "Standing at end" +
                "of road before small brick building"));
        locations.put(2, new Location(2, "at top of hill"));
        locations.put(3, new Location(3, "inside building"));
        locations.put(4, new Location(4, "In a valley beside stream"));
        locations.put(5, new Location(5, "in forest"));

        locations.get(1).addExit("w", 2);
        locations.get(1).addExit("e", 3);
        locations.get(1).addExit("s", 4);
        locations.get(1).addExit("n", 5);

        locations.get(2).addExit("n", 5);

        locations.get(3).addExit("w", 1);

        locations.get(4).addExit("n", 1);
        locations.get(4).addExit("w", 2);

        locations.get(5).addExit("s", 1);
        locations.get(5).addExit("w", 2);
        System.out.println("====");

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("north", "n");
        vocabulary.put("east", "e");
        vocabulary.put("west", "w");
        vocabulary.put("south", "s");

        int loc = 1;
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
