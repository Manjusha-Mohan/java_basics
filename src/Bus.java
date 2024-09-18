public class Bus implements Vehicle{
    @Override
    public void vehicleSound() {
        System.out.println("Bus is a public transport having 50 seat capacity");
    }

    @Override
    public void run() {
        System.out.println("Bus run with a speed of 40km/h");
    }
}
