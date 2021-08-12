package Inheritance_concept;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setFuelType("Disel");
        car.setModel("Audi Car");

        System.out.println(car);

        AudiCar audi=new AudiCar();
        audi.setEngine("xyz");
        audi.setWheelBrand("wer");
        audi.setModel("Audi");
        audi.setFuelType("abc");

        System.out.println(audi);
    }
}
