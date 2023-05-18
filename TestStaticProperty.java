public class TestStaticProperty {
    public static void main(String[] args) {
    Car car1 = new Car("Mazda 3", "Skyactiv 3");
    System.out.println(Car.numberOfCars);
    System.out.println("Car name: " + car1.getName() + " type: " + car1.getEngine() + " ID: " + Car.numberOfCars);
    Car car2 = new Car("Mazda 6", "Skyactiv 6");
    System.out.println(Car.numberOfCars);
    System.out.println("Car name: " + car2.getName() + " type: " + car2.getEngine() + " ID: " + Car.numberOfCars);
    car1.setName("Mazda 4");
    car2.setEngine("Skyactiv 10");
    System.out.println("Car name: " + car1.getName() + " type: " + car1.getEngine());
    System.out.println("Car name: " + car2.getName() + " type: " + car2.getEngine());
    }
}
class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public String getName() {
        return this.name;
    }
    public String getEngine() {
        return this.engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
