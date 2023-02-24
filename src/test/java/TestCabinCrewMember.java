import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCabinCrewMember {

    CabinCrewMember cabinCrewMember1;

    @Before
    public void before() {
        cabinCrewMember1 = new CabinCrewMember("Ange", ListOfCrewMembers.LEADATTENDANT, "ready for take-off");
    }

    @Test
    public void cabinCrewHasName(){
        assertEquals("Ange", cabinCrewMember1.getName());
    }

    @Test
    public void cabinCrewHasRole(){
        assertEquals(ListOfCrewMembers.LEADATTENDANT, cabinCrewMember1.getRole());
    }

    @Test
    public void message(){
        assertEquals("ready for take-off", cabinCrewMember1.getMessage());
    }
}
