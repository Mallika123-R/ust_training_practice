package Stream_Example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamEx {
    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(99,77,56,78,39,40,89,34,89);
        //iterate the
        list.forEach(x->System.out.println(x));

        //print no greater than 50
        Predicate<Integer> greaterThanFifty=(x)->x>50;
        Consumer<Integer> output=x->System.out.println(x);

        System.out.println("Number greater than 50");
        list.stream().filter(greaterThanFifty).forEach(output);

        System.out.println("Increase all value between 50-100 by 30");
        list.stream()
                .filter(num->num>50 && num<100)
                .map(y->y+30)
                .sorted()
                .forEach(x-> System.out.println(x));

        System.out.println("Increase all value between 50-100 by 30 using collectior");
       List<Integer> res= list.stream()
                .filter(num->num>50 && num<100)
                .map(y->{
                    int z=y+30;
                    return z;
                })
                .sorted()
                .collect(Collectors.toList());
       res.forEach((x)->System.out.println(x));

        System.out.println("Increase all value between 50-100 by 30 using collectior");



    }
}
