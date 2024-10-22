package Inheritance.cars;

public class callingcars {
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

    }
}
