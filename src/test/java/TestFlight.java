import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class TestFlight {

    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember crewMember1;
    CabinCrewMember crewMember2;
    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void before(){
        pilot1 = new Pilot("Dan", ListOfCrewMembers.CAPTAIN, "jk123");
        pilot2 = new Pilot("Marcus", ListOfCrewMembers.FIRSTOFFICER, "jk123");
        crewMember1 = new CabinCrewMember("Hannah", ListOfCrewMembers.LEADATTENDANT, "Ready");
        crewMember2 = new CabinCrewMember("Davie", ListOfCrewMembers.FLIGHTATTENDANT, "Ready");
        passenger1 = new Passenger("Luna", 2);
        passenger2 = new Passenger("Jenyth", 2);
        ArrayList<Pilot> pilots = new ArrayList<Pilot>();
        pilots.add(pilot1);
        pilots.add(pilot2);
        ArrayList<CabinCrewMember> crewMembers = new ArrayList<CabinCrewMember>();
        crewMembers.add(crewMember1);
        crewMembers.add(crewMember2);
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        HashMap<String, String> flightinfo = new HashMap<>();
        flightinfo.put("flight number", "bd1234");
        flightinfo.put("destination", "ibiza");
        flightinfo.put("departure airport", "edinburgh");
        flightinfo.put("departure time", "1200");
        flightinfo.put("arrive time", "1500");
        flight = new Flight(pilots, crewMembers, passengers, flightinfo);
    }

    @Test
    public void canGetPilot(){
        assertEquals("Dan", flight.getPilots().get(0).getName() );
    }

    @Test
    public void canGetCrewMember(){
        assertEquals("Hannah", flight.getCrewMembers().get(0).getName());
    }

    @Test
    public void canGetPassenger(){
        assertEquals("Luna", flight.getPassengers().get(0).getName());
    }

    @Test
    public void canGetPassenger1(){
        assertEquals("Jenyth", flight.getPassengers().get(1).getName());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("edinburgh", flight.getFlightInfo().get("departure airport"));
    }
    @Test
    public void canGetFlightNumber(){
        assertEquals("bd1234", flight.getFlightInfo().get("flight number"));
    }
    @Test
    public void canGetDepartTime(){
        assertEquals("1200", flight.getFlightInfo().get("departure time"));
    }
    @Test
    public void canGetArriveTime(){
        assertEquals("1500", flight.getFlightInfo().get("arrive time"));
    }
}
