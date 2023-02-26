//public class FlightManager {
//
//    private int totalPassengerWeight;
//    private int totalBaggageWeight;
//    private int weightAllowance;
//
//    // for testing i need to create a new instance of the flight class
//    // look into making a new instance of the passenger class for the functions underlined red
//
//
//    public FlightManager(){
//        this.totalPassengerWeight = 0;
//        this.totalBaggageWeight = 0;
//        this.weightAllowance = 1000;
//    }
//
//    public void totalPassengerWeight(){
//        for (int i = 0; i < Flight.getPassengers(); i++){
//            this.totalPassengerWeight += 70;
//        }
//    }
//
//    public void totalBaggageWeight(){
//        int bag = Integer.parseInt(Flight.getFlightInfo().get("baggage allowance"));
//        int bagWeight = bag * Passenger.getNumberOfBags();
//        totalBaggageWeight += bagWeight;
//    }
//
//    public int getWeightAllowance(){
//        return this.weightAllowance;
//    }
//
//    public int getTotalWeight(){
//        return this.totalPassengerWeight + this.totalBaggageWeight;
//    }
//
//    public int getRemainingWeightAllowance(){
//        int totalPassengerAndBaggage = this.totalPassengerWeight + totalBaggageWeight;
//        return this.weightAllowance - totalPassengerAndBaggage;
//    }
//}
