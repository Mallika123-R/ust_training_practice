package ust;

import com.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {
       // Car car=new Car();
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Car maruti=context.getBean("maruti",Car.class);
       System.out.println("Maruti "+maruti.getId()+".."+maruti.getModel()+".."+maruti.getPrice()+".."+maruti.getCompany());
       Car tata=context.getBean("tata",Car.class);
        System.out.println("Tata "+maruti.getId()+".."+tata.getModel()+".."+tata.getPrice()+".."+tata.getCompany());

    }
}
