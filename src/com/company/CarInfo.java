package com.company;

import java.util.Random;

/**
 * Created by studentcompsci on 7/10/17.
 */
public class CarInfo {
    private int id;
    Random rand = new Random();

    public CarInfo(){
        id = rand.nextInt(10000);
    }

    public int getId() {
        return id;
    }
}
