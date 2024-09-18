public class VehicleInheritance {
    private String brand;
    public String getBrand(){
        return brand;
    }
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void breakFunc(){
        System.out.println("Car has function called break");
    }
}
