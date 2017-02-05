package com.nikesh.ticketprinter;

import com.nikesh.ticketprinter.printerdriver.DotMatrixPrinter;
import com.nikesh.ticketprinter.printerdriver.InkjetPrinter;
import com.nikesh.ticketprinter.printerdriver.ThreeDPrinter;

/**
 * Created by nikesh on 2/5/17.
 */
public class PrintJob {

    public static void main(String[] args) {
        Printer printer = new DotMatrixPrinter();
        printer.print("NIKESH");

        printer = new InkjetPrinter();
        printer.print("NIKESH");

        printer = new ThreeDPrinter();
        printer.print("Duck");
    }
}
