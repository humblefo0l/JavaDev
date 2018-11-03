package com.gaurav;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class    Demo {
    public static void main(String[] args){
        LinkedList<String> placestoVisit = new LinkedList<String>();
        addInOrder(placestoVisit, "Delhi");
        addInOrder(placestoVisit, "Bangalore");
        addInOrder(placestoVisit, "Pune");
        addInOrder(placestoVisit, "Gurgaon");
        addInOrder(placestoVisit, "Mumbai");
        addInOrder(placestoVisit, "Delhi");


//        printList(placestoVisit);
//        placestoVisit.add(1, "Chandigarh");
//        printList(placestoVisit);
//
//        placestoVisit.remove(5);
        printList(placestoVisit);
        addInOrder(placestoVisit, "Mumbai");
        addInOrder(placestoVisit, "Delhi");

        printList(placestoVisit);
        visit(placestoVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=====================");
    }


    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringLinkedList = linkedList.listIterator();

        while (stringLinkedList.hasNext()){
            int comparion = stringLinkedList.next().compareTo(newCity);

            if (comparion == 0){
                System.out.println(newCity + " is already in the list.");
                return false;
            }else if (comparion > 0){
                stringLinkedList.previous();
                stringLinkedList.add(newCity);
                return true;
            }else if (comparion <0){
            }
        }

        stringLinkedList.add(newCity);
        return true;
    }


    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities in itenerary");
            return;
        }else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else{
                        System.out.println("We are the starting the list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static  void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - next visit\n" +
                "2 - previous visit\n" +
                "3 - print the Menu option.");
    }




}
