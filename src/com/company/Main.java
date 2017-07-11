package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----  Welcome to the Park Here App  -----");
        System.out.println("(0 = available parking space, 1 = unavailable parking space)\n");

        //create the parking lot
        XUParkingLot lot1 = new XUParkingLot();

        lot1.lotIsEmpty();
        System.out.println(lot1.toString());

        lot1.timeToParkACar();
    }
}
