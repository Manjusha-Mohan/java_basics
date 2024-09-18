public class CarInheritance extends VehicleInheritance{
    private String modelName;
    public String getModelName(){
        return modelName;
    }
    public void setModelName(String newModel){
        this.modelName = newModel;
    }

    public static void main(String[] args) {
        CarInheritance car = new CarInheritance();
        car.setBrand("Lexus");
        car.setModelName("RX 350");
        System.out.println(car.getBrand());
        System.out.println(car.getModelName());
        car.breakFunc();
    }
}
