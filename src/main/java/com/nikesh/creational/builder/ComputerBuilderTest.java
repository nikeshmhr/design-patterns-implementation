package com.nikesh.creational.builder;

import com.nikesh.creational.builder.Computer.ComputerBuilder;

/**
 *
 * @author nikesh
 */
public class ComputerBuilderTest {

    public static void main(String[] args) {
//        Computer computer = new ComputerBuilder().enableBluetooth(true).enableGraphics(true).setHdd((short)500).setRam((short) 8).build();
        Computer computer = new ComputerBuilder()
                .enableBluetooth(true)
                .enableGraphics(true)
                .setHdd((short) 500)
                .setRam((short) 8)
                .build();

        System.out.println(computer);
    }

}
