package constructor_method;

public class parameterize_constructor {

    double length;
    double breath;

    public parameterize_constructor(double length, double breath)
    {
        this.length=length;
        this.breath=breath;
    }
    public double calculate()
    {
        return length * breath;
    }

    public static void main(String[] args)
    {
        parameterize_constructor pc= new parameterize_constructor(2.5, 1.5);
        double rectangle=pc.calculate();
        System.out.println("Area of rectangle: "+rectangle);
    }
}
