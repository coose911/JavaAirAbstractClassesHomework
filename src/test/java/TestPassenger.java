import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPassenger {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Jenyth", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Jenyth", passenger1.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger1.getNumberOfBags());
    }
}
