import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.states.State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrafficLightCtrlTest {

    TrafficLightCtrl test = TrafficLightCtrl.getInstance();
    List<State> one = new ArrayList();
    List<State> two = new ArrayList();

    @BeforeEach
    public void prepare(){
        for(int i = 0; i < 2; i++) {
            one.remove(i);
            two.remove(i);
        }
    }

    @Test
    /*
    test if red is followed by yellow
     */
    void redTurnsYellow(){
        for(int i = 0; i < 3; i++){
            test.update();
        }
        one.add(test.getPreviousState());
        one.add(test.getCurrentState());
        two.add(test.getRedState());
        two.add(test.getYellowState());
        assertEquals(one, two);
    }

    @Test
    /*
    test if red and yellow is followed green
     */
    void yellowTurnsGreen(){
        for(int i = 0; i < 4; i++){
            test.update();
        }
        one.add(test.getPreviousState());
        one.add(test.getCurrentState());
        two.add(test.getYellowState());
        two.add(test.getGreenState());
        assertEquals(one, two);
    }

    @Test
    /*
    test if green is followed by yellow
     */
    void greenTurnsYellow(){
        for(int i = 0; i < 5; i++){
            test.update();
        }
        one.add(test.getPreviousState());
        one.add(test.getCurrentState());
        two.add(test.getGreenState());
        two.add(test.getYellowState());
        assertEquals(one, two);
    }

    @Test
    /*
    test if green and yellow is followed red
     */
    void yellowTurnsRed(){
        for(int i = 0; i < 6; i++){
            test.update();
        }
        one.add(test.getPreviousState());
        one.add(test.getCurrentState());
        two.add(test.getYellowState());
        two.add(test.getRedState());
        assertEquals(one, two);
    }

}
