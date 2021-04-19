package trafficlight.gui;


import trafficlight.ctrl.Observer;
import trafficlight.states.State;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    public TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    //TODO implement a part of the pattern here

    @Override
    public void update(State s) {
        if (isOn()) {
            turnOn(false);
        } else {
            turnOn(true);
        }
    }

}
