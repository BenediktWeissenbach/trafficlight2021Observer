import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Repo-Link:

public class SubjectTest {

    Subject subject = new Subject();
    TrafficLightCtrl testCtrl = TrafficLightCtrl.getInstance();

    @BeforeAll
    public void preperation() {
        subject.addObserver(testCtrl);
    }

    @Test
    /*
    Checks method "addObserver"
    If accObserver works size of the List must be 1
     */
    void testAddObserver(){
        int actual = subject.getObservers().size();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    /*
    Checks method "removeObserver"
    If removeObserver works size of the List after the remove-method must be 0
     */
    void testRemoveObserver() {
        subject.removeObserver(testCtrl);
        int actual = subject.getObservers().size();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    /*

     */
    void

}
