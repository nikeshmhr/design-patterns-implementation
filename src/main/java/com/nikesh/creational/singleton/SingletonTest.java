package com.nikesh.creational.singleton;

/**
 * Created by nikesh on 1/22/17.
 */
public class SingletonTest {

    public SingletonTest(){

        Earth earth = Earth.getInstance();

        earth.setNoOfCountries((short) 200);
        earth.setNoOfPopulation(7000000000L);

        System.out.println("EARTH ONE :: " + earth);

        Earth earth1 = Earth.getInstance();
        System.out.printf("EARTH TWO :: " + earth1);

    }

    public static void main(String[] args) {
        SingletonTest st = new SingletonTest();
    }

}
