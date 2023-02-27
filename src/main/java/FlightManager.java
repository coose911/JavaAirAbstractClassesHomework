public class FlightManager {

    private int totalPassengerWeight;
    private int totalBaggageWeight;
    private int weightAllowance;

    Flight flight;
    Passenger passenger;

    public FlightManager(Flight flight, Passenger passenger){
        this.flight = flight;
        this.passenger = passenger;
        this.totalPassengerWeight = 0;
        this.totalBaggageWeight = 0;
        this.weightAllowance = 1000;
    }

    public int totalPassengerWeight(){
        for (int i = 0; i < flight.getPassengers().size(); i++){
            this.totalPassengerWeight += 70;
        }
        return this.totalPassengerWeight;
    }

    public int totalBaggageWeight(){
        int bag = Integer.parseInt(flight.getFlightInfo().get("baggage allowance"));
        int bagWeight = bag * passenger.getNumberOfBags();
        totalBaggageWeight += bagWeight;
        return totalBaggageWeight;
    }

    public int getWeightAllowance(){
        return this.weightAllowance;
    }

    public int getTotalWeight(){
        return this.totalPassengerWeight + this.totalBaggageWeight;
    }

    public int getRemainingWeightAllowance(){
        int totalPassengerAndBaggage = this.totalPassengerWeight + totalBaggageWeight;
        return this.weightAllowance - totalPassengerAndBaggage;
    }
}
