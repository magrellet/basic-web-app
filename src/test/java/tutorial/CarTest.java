package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tutorial.mvc.Car;
import tutorial.mvc.Engine;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by Martin on 03/04/2016.
 */
public class CarTest {

    @Mock
    private Engine engine;

    //Inject in the constructor
    @InjectMocks
    private Car car;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testWarning(){
        when(engine.getRpm()).thenReturn(6000);
        car.accelerate();
        assertEquals("Slow Down!", car.getWarningMessage());

    }

}
