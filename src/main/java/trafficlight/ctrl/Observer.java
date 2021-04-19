package trafficlight.ctrl;

import trafficlight.states.State;

public interface Observer {

    void update(State s);

}
