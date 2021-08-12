package constructor_method;

public class constructor_overloading {
    String msg="Constructor overloading";

    public constructor_overloading()
    {
        System.out.println("Print message: "+msg);
    }
    public constructor_overloading(double radius)
    {
        System.out.println("Area of cirle: "+3.14 * radius * radius);
    }
    public constructor_overloading(double length, double breath, double height)
    {
        System.out.println("Area of rectangle: "+length*breath*height);
    }


    public static void main(String[] args)
    {
        constructor_overloading msg=new constructor_overloading();
        constructor_overloading cirle=new constructor_overloading(5.6);
        constructor_overloading rectangle=new constructor_overloading(2.3, 4.5, 5.6);
    }

}
