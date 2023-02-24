import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Flight {

    private ArrayList<Pilot>pilots;
    private ArrayList<CabinCrewMember>crewMembers;
    private ArrayList<Passenger>passengers;
    private HashMap<String, String> flightInfo;
    private int seats;


    public Flight(ArrayList<Pilot>pilots, ArrayList<CabinCrewMember>crewMembers, ArrayList<Passenger>passengers, HashMap<String, String>flightInfo){
        this.pilots = pilots;
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.flightInfo = flightInfo;
        this.seats = 4;
    }

    public ArrayList<Pilot> getPilots(){
        return this.pilots;
    }

    public ArrayList<CabinCrewMember> getCrewMembers(){
        return this.crewMembers;
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public HashMap<String, String> getFlightInfo(){
        return this.flightInfo;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int getAvailableSeats(){
        for (int i = 0; i < this.passengers.size(); i++){
            this.seats -= 1;
        }
        return this.seats;
    }

    public String bookFlight(){
        int numPassengers = this.passengers.size();
        int capacity = this.seats;
        if (numPassengers > capacity){
            return "flight fully booked";
        } else{
            return "flight booked";
        }
    }

}
