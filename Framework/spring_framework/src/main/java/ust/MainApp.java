package ust;

import com.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args)
    {
        // Car car=new Car();
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Car hyndai=context.getBean("Hyndai",Car.class);
        System.out.println("car details");
        System.out.println(hyndai.getId());
        System.out.println(hyndai.getModel());
        System.out.println(hyndai.getPrice());
        System.out.println(hyndai.getCompany());
        System.out.println(hyndai.getMrf().getId());
        System.out.println(hyndai.getMrf().getModelType());


    }
}
