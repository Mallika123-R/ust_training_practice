import java.util.Optional;

public class Optional_null {

    public static void main(String[] args)
    {
        String str=null;
       //System.out.println(str.length());
        Optional<String> string= Optional.ofNullable(str);

        if(string.isPresent())
        {
            System.out.println(string);
        }
        else
        {  str="Optional check for null values";
            System.out.println(str);
        }

    }
}
