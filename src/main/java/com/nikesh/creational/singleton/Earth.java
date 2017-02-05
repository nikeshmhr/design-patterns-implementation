package com.nikesh.creational.singleton;

/**
 * Created by nikesh on 1/22/17.
 */
public class Earth {

    private short noOfCountries;

    private long noOfPopulation;

    private static Earth ourInstance = new Earth();

    public static Earth getInstance() {
        if (ourInstance == null) {
            ourInstance = new Earth();
        }
        return ourInstance;
        
    }

    private Earth() {
    }

    public short getNoOfCountries() {
        return noOfCountries;
    }

    public void setNoOfCountries(short noOfCountries) {
        this.noOfCountries = noOfCountries;
    }

    public long getNoOfPopulation() {
        return noOfPopulation;
    }

    public void setNoOfPopulation(long noOfPopulation) {
        this.noOfPopulation = noOfPopulation;
    }

    @Override
    public String toString() {
        return "Earth{" +
                "noOfCountries=" + noOfCountries +
                ", noOfPopulation=" + noOfPopulation +
                '}';
    }
}
