import java.util.function.Function;

public class lambdaEx {

    public static void main(String[] args)
    {
        Function<Integer, Integer> result= (Integer input) ->
        {
            int output=input+100;
            return output;
        };

        int ans=result.apply(50);
        System.out.println(ans);

       // Function<Integer, String> agefuc=(age)-

    }
}
