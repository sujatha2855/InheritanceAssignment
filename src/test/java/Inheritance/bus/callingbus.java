package Inheritance.bus;

public class callingbus {
    public static void main(String[] args) {

        Semisleeperbus semisleeper=new Semisleeperbus();
        semisleeper.SeatBelts();
        semisleeper.airConditioning();
        semisleeper.noOfWindows();
        SleeperBuses sleeperbus= new SleeperBuses();
        sleeperbus.EnginePerformance();
        sleeperbus.noOfWindows();
    }
}
