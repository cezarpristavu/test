package automation;

import java32.Electronics;

import java.util.ArrayList;
import java.util.List;

public class Alexa implements Electronics {

    private static final String TYPE = "Smart Device";
    private boolean state;
    List<Electronics> myElectronics = new ArrayList<>();

    public Alexa() {
        state = false;
    }

    public List<Electronics> addDevice(Electronics electronicDevice) {
        if (state) {
            myElectronics.add(electronicDevice);
            String message = String.format("New %s device has been registered!", electronicDevice.getType());
            System.out.println(message);
        } else {
            System.out.println("Alexa is OFFLINE!");
        }
        return this.myElectronics;
    }

    public List<Electronics> removeDevice(Electronics electronicDevice) {
        if (state) {
            myElectronics.remove(electronicDevice);
            String message = String.format("%s device has been removed!", electronicDevice.getType());
            System.out.println(message);
        } else {
            System.out.println("Alexa is OFFLINE!");
        }
        return this.myElectronics;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public void turnOn() {
        if (state) {
            System.out.println(TYPE + " ALREADY ON!");
        } else {
            this.state = true;
            System.out.println(TYPE + " TURNED ON!");
        }
    }

    @Override
    public void turnOff() {
        if (!state) {
            System.out.println(TYPE + " ALREADY OFF!");
        } else {
            this.state = false;
            System.out.println(TYPE + " TURNED OFF!");
        }
    }

    public void printDevices() {
        for (Electronics e: myElectronics) {
            System.out.println(e);
        }
    }

    public void turnOn(Electronics electronics) {
        System.out.println(TYPE + " has turned on " + electronics.getType());
        electronics.turnOn();
    }

    public void turnOff(Electronics electronics) {
        System.out.println(TYPE + " has turned off " + electronics.getType());
        electronics.turnOn();
    }
}
