package Inheritance_concept;

public class AudiCar extends Car{
    private String Engine;
    private String WheelBrand;

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getWheelBrand() {
        return WheelBrand;
    }

    public void setWheelBrand(String wheelBrand) {
        WheelBrand = wheelBrand;
    }

   /* @Override
    public String toString() {
        return "AudiCar{" +
                "Engine='" + Engine + '\'' +
                ", WheelBrand='" + WheelBrand + '\'' +
                '}';
    }*/
    public void display()
    {
        System.out.println(getModel());
        System.out.println(getFuelType());
        System.out.println(getWheelBrand());
        System.out.println(getEngine());
    }
}
