package trafficlight.gui;

import trafficlight.ctrl.TrafficLightCtrl;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<TrafficLightCtrl> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(TrafficLightCtrl observer){
        observers.add(observer);
    }

    public void removeObserver(TrafficLightCtrl observer){
        observers.remove(observer);
    }

    //https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
    public void notifyObserver(){
        for (TrafficLightCtrl observer : observers) {
            observer.update();
        }
    }

    public List<TrafficLightCtrl> getObservers(){
        return observers;
    }

}
