package com.gaurav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("INOX", 8,
                12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        Collections.shuffle(seatCopy);
        System.out.println("Printing SeatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortedList(seatCopy);
        System.out.println("Printing Sorted seatCopy");
        printList(seatCopy);

////        theatre.getSeats();
//        if(theatre.reserveSeat("D13")){
//            System.out.println("Please Pay");
//        }else {
//            System.out.println("Sorry , seat is already taken");
//        }
//
////
////        if(theatre.reserveSeat("H01")){
////            System.out.println("Please Pay");
////        }else {
////            System.out.println("Sorry , seat is already taken");
//        }
    }


    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat: list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=====================================");
    }

    public static void sortedList(List<? extends Theatre.Seat> list){
        for(int i=0; i<list.size()-1;i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
