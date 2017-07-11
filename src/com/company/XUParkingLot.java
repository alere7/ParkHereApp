package com.company;

/**
 * Created by studentcompsci on 7/10/17.
 */
public class XUParkingLot {
    private int lot[];
    private String message;
    private int numOfCars;
    private CarInfo car;
    private int count;

    public XUParkingLot(){
        car = new CarInfo();
        lot = new int[10];
        message = "";
        numOfCars = 20;
        count = 0;
    }

    public void timeToParkACar() {
        int parkingSpot = car.getId() % 10;

            if (lot[parkingSpot] == 0) {
                lot[parkingSpot] = 1;
                count++;
            } else if (parkingSpot == 9) {
                parkingSpot = 0;
            } else
                parkingSpot++;


        message = "Car " + car.getId() + " parks in Space " + parkingSpot + ". " + count + " cars in the lot.";

        //test
        System.out.println(toString());
    }

    public String lotIsEmpty(){
        if (lot[0] == 0 && lot[1] == 0 && lot[2] == 0 && lot[3] == 0 && lot[4] == 0 && lot[5] == 0
                && lot[6] == 0 && lot[7] == 0 && lot[8] == 0 && lot[9] == 0){
            message = "No cars parked in the lot.";
        }
        return message;
    }

    public int[] getLot() {
        return lot;
    }

    public void setLot(int[] lot) {
        this.lot = lot;
    }

    @Override
    public String toString() {
        return lot[0] + "" + lot[1] + lot[2] + lot[3] + lot[4] + " " + lot[5] + lot[6]  + lot[7] + lot[8] + lot[9]
                + "\t\t" + message;
    }
}
