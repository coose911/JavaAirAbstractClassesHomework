import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Flight {


    private ArrayList<Pilot>pilots;
    private ArrayList<CabinCrewMember>crewMembers;
    private ArrayList<Passenger>passengers;
    private HashMap<String, String> flightInfo;


    public Flight(ArrayList<Pilot>pilots, ArrayList<CabinCrewMember>crewMembers, ArrayList<Passenger>passengers, HashMap<String, String>flightInfo){
        this.pilots = pilots;
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.flightInfo = flightInfo;
    }

//    public void addPilot(Pilot pilot){
//        this.pilots.add(pilot);
//    }
//
//    public void addCrewMember(CabinCrewMember crewMember){
//        this.crewMembers.add(crewMember);
//    }
//
//    public void addPassenger(Passenger passenger){
//        this.passengers.add(passenger);
//    }

    public ArrayList<Pilot> getPilots(){
        return this.pilots;
    }

//    public ArrayList<Pilot> getPilotsName(){
//        return this.pilots.getName();
//    }

    public ArrayList<CabinCrewMember> getCrewMembers(){
        return this.crewMembers;
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public HashMap<String, String> getFlightInfo(){
        return this.flightInfo;
    }


}
