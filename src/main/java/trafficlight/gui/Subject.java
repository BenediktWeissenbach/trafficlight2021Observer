package trafficlight.gui;

import trafficlight.ctrl.Observer;
import trafficlight.ctrl.TrafficLightCtrl;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(TrafficLight observer){
        observers.add(observer);
    }

    public void removeObserver(TrafficLight observer){
        observers.remove(observer);
    }

    //https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public List<Observer> getObservers(){
        return observers;
    }

}
