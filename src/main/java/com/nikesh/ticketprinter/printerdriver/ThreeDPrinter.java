package com.nikesh.ticketprinter.printerdriver;

import com.nikesh.ticketprinter.Printer;

/**
 * Created by nikesh on 2/5/17.
 */
public class ThreeDPrinter implements Printer {
    public void print(String text) {
        System.out.println("-----------3D----------");
        System.out.println("Scanning object......");
        System.out.println("Modelling object......");
        System.out.println(text);
        System.out.println("Finished.");
    }
}
