package Inheritance.cars;

public class SUVCars extends carconcepts {
    public void offRoad() {
        System.out.println("this is an offroad car");
    }

    public void fourWheelDrive()
    {

        System.out.println("this is four wheel drive car");
    }


    public void startEngine() {
        System.out.println("the engine is started for SUV Car");
    }


    public void stopEngine()
    {
        System.out.println("the engine is stopped for SUV car");
    }
    public void engineType()
    {
        System.out.println("this is a petrol engine");
    }
    public void airConditioner()

    {
        System.out.println("this is as air conditioner for the SUV car");
    }

    public static class callingcars {
        public static void main(String[] args) {


        }
    }
}
