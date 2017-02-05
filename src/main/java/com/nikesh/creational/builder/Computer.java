package com.nikesh.creational.builder;

/**
 *
 * @author nikesh
 */
public class Computer {

    private short ram;

    private short hdd;

    private boolean graphicsCardEnabled;

    private boolean bluetoothEnabled;

    private Computer(ComputerBuilder cb) {

    }

    private Computer() {

    }

    public short getRam() {
        return ram;
    }

    public void setRam(short ram) {
        this.ram = ram;
    }

    public short getHdd() {
        return hdd;
    }

    public void setHdd(short hdd) {
        this.hdd = hdd;
    }

    public boolean isGraphicsCardEnabled() {
        return graphicsCardEnabled;
    }

    public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        this.graphicsCardEnabled = graphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return bluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        this.bluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" + "ram=" + ram + ", hdd=" + hdd + ", graphicsCardEnabled=" + graphicsCardEnabled + ", bluetoothEnabled=" + bluetoothEnabled + '}';
    }

    static class ComputerBuilder {

        private final Computer computer;

        public ComputerBuilder() {
            computer = new Computer();
        }

        public ComputerBuilder setRam(short ram) {
            computer.setRam(ram);
            return this;
        }

        public ComputerBuilder setHdd(short hdd) {
            computer.setHdd(hdd);
            return this;
        }

        public ComputerBuilder enableGraphics(boolean enabled) {
            computer.setGraphicsCardEnabled(enabled);
            return this;
        }

        public ComputerBuilder enableBluetooth(boolean enabled) {
            computer.setBluetoothEnabled(enabled);
            return this;
        }

        public Computer build() {
            return this.computer;
        }

    }
}
