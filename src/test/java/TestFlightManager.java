import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
public class TestFlightManager {

    Flight flight;
    FlightManager flightManager;
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
        flightinfo.put("baggage allowance", "20");
        flight = new Flight(pilots, crewMembers, passengers, flightinfo);
        flightManager = new FlightManager(flight, passenger1);
    }

    @Test
    public void testPassengerWeight(){
        assertEquals(140, flightManager.totalPassengerWeight());
    }

    @Test
    public void testBaggageWeight(){
        assertEquals(40, flightManager.totalBaggageWeight());
    }

    // look into setting up a function to get passenger bags on the flight so you dont access passenger directly
    // but the bags booked onto the flight as its a flight manager.
}
