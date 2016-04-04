package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tutorial.mvc.Calculator;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by Martin on 03/04/2016.
 */
public class CalculatorTest {

    @Mock
    public static Calculator calc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        //calc = new Calculator();
    }
    @Test
    public void testAbs(){
        //assertEquals(4,calc.abs(-4));
        when(calc.abs(-20)).thenReturn(20);
        assertEquals(20,calc.abs(-20));
    }

}
