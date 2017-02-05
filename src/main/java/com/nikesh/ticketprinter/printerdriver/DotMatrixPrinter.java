package com.nikesh.ticketprinter.printerdriver;

import com.nikesh.ticketprinter.Printer;

/**
 * @author nikesh on 2/5/17.
 */
public class DotMatrixPrinter implements Printer {
    public void print(String text) {
        System.out.println("------------DOTMATRIX-----------");
        System.out.println("Printing.............");
        System.out.println("Heating the hammer....");
        System.out.println("Rolling the ribbon....");
        System.out.println("Striking each letter....");
        System.out.println(text);
        System.out.println("Finished.");
    }
}
