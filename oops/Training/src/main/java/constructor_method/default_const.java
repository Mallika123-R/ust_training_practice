package constructor_method;

public class default_const {

    double length;
    double breath;

    public default_const()
    {
        length=10.23;
        breath=20.56;

    }
    public double calculate()
    {
        return length * breath;
    }

    public static void main(String[] args)
    {
        default_const obj = new default_const();
        double rectangle= obj.calculate();
        System.out.println("Area of rectangle:" +rectangle);

    }
}
