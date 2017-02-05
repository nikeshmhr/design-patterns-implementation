package com.nikesh.ticketprinter.printerdriver;

import com.nikesh.ticketprinter.Printer;

/**
 * Created by nikesh on 2/5/17.
 */
public class InkjetPrinter implements Printer {
    public void print(String text) {
        System.out.println("------------INKJET----------");
        System.out.println("Printing.............");
        System.out.println("Spraying ink to paper....");
        System.out.println("Rolling the paper....");
        System.out.println(text);
        System.out.println("Finished.");
    }
}
