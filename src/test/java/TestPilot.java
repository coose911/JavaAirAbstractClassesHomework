import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPilot {

    Pilot pilot1;

    @Before
    public void Before(){
        pilot1 = new Pilot("Dan", ListOfCrewMembers.CAPTAIN, "jk8008");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Dan", pilot1.getName());

    }

    @Test
    public void pilotHasRole(){
        assertEquals(ListOfCrewMembers.CAPTAIN, pilot1.getRole());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("jk8008", pilot1.hasLicenseNumber());
    }

}
