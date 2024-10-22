package Inheritance.bikes;

public class callingbikes {
    public static void main(String[] args) {
        sportsbikes bike= new sportsbikes();
        bike.startEngine();
        bike.stopEngine();
        bike.clutch();
        Scootybikes scooty=new Scootybikes();
        scooty.noOfWheels();
        scooty.Color();



    }
}
