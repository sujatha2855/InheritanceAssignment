package Inheritance.cars;

import Inheritance.bikes.Scootybikes;
import Inheritance.bikes.sportsbikes;
import Inheritance.bus.Semisleeperbus;
import Inheritance.bus.SleeperBuses;

public class callingVehicles {
    public static void main(String[] args) {
        SUVCars suvcars=new SUVCars();
        suvcars.airConditioner();
        suvcars.engineType();
        suvcars.startEngine();
        suvcars.offRoad();
        Hatchbagcars hatchbagcars=new Hatchbagcars();
        hatchbagcars.SafetyFeatures();
        hatchbagcars.startEngine();
        hatchbagcars.seatingCapacity();
        Sedancars sedancars= new Sedancars();
        sedancars.performance();
        sedancars.seatCapacity();
        Semisleeperbus semisleeper=new Semisleeperbus();
        semisleeper.SeatBelts();
        semisleeper.airConditioning();
        semisleeper.noOfWindows();
        SleeperBuses sleeperbus= new SleeperBuses();
        sleeperbus.EnginePerformance();
        sleeperbus.noOfWindows();
        sportsbikes bike= new sportsbikes();
        bike.startEngine();
        bike.stopEngine();
        bike.clutch();
        Scootybikes scooty=new Scootybikes();
        scooty.noOfWheels();
        scooty.Color();
    }


}
