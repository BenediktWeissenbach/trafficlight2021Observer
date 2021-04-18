package trafficlight.gui;

import trafficlight.ctrl.TrafficLightCtrl;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<TrafficLightCtrl> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(){}

    public void removeObserver(){}

    public void notifyObserver(){}

    public List<TrafficLightCtrl> getObservers(){
        return observers;
    }

}
