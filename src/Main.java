public class Main {
    public static void main(String[] args) {
        PersonClass person = new PersonClass();
        person.setName("Parthiv");
        System.out.println(person.getName());
       //polymorphism
        PolymorphismExampleAnimal animal = new PolymorphismExampleAnimal();
        PolymorphismExampleAnimal pig = new Pig();
        PolymorphismExampleAnimal dog = new Dog();
        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
        //create an outer class object to access the inner class element
        Main main = new Main(); //  main outer class
        OuterClass outer = main.new OuterClass();
        OuterClass.InnerClass inner =outer.new InnerClass();
        System.out.println(outer.x + " " + inner.y);
        //abstract class
        Cat cat = new Cat();
        cat.animalSound();
        cat.sleep();
        //interface
        Bus bus = new Bus();
        Car car = new Car();
        bus.vehicleSound();
        bus.run();
        car.vehicleSound();
        car.run();
    }
    //outer class and inner class
    class OuterClass {
        int x = 10;

        class InnerClass{
            int y = 7;
        }
    }
}