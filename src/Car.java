public class Car implements Vehicle{

    @Override
    public void vehicleSound() {
        System.out.println("Car is a private/public transport");
    }

    @Override
    public void run() {
        System.out.println("Car run with a speed of 80km/h");

    }
}
