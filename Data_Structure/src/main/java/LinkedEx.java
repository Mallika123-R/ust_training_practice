import java.util.Iterator;
import java.util.LinkedList;

public class LinkedEx {

    public static void main(String[] args)
    {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.addFirst(111);
        list.addLast(222);
        System.out.println("---"+list);

        System.out.println(list.getLast());
        System.out.println(list.getFirst());

        boolean b=list.offerFirst(333);
        System.out.println("--offerfirst----"+list);

        Integer peak=list.peek();
        System.out.println("--peak--"+peak);

        Integer poll=list.poll();
        System.out.println("---poll---"+poll);

        list.push(2324);
        Integer pop=list.pop();
        System.out.println("--pop---"+pop);

        System.out.println("---"+list);

        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext())
        {   Integer value=iterator.next();
            if(value.equals(111))
            {
                iterator.remove();
            }
           // System.out.println(iterator.next());
            System.out.println(value);
        }


    }
}
