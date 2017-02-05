package com.nikesh.ticketprinter.factory;

import com.nikesh.ticketprinter.Printer;
import com.nikesh.ticketprinter.printerdriver.DotMatrixPrinter;
import com.nikesh.ticketprinter.printerdriver.InkjetPrinter;
import com.nikesh.ticketprinter.printerdriver.ThreeDPrinter;

/**
 * Created by nikesh on 2/5/17.
 */
public final class PrinterFactory {

    public static Printer createPrinter(String name) {
        if (name.equalsIgnoreCase("Inkjet")) {
            return new InkjetPrinter();
        } else if (name.equalsIgnoreCase("DotMatrix")) {
            return new DotMatrixPrinter();
        } else if (name.equalsIgnoreCase("3D")) {
            return new ThreeDPrinter();
        } else {
            return null;
        }
    }

}
