package java;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sorting {
    //write logic to sort given list in descending order
    //public ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> list)
    // {
    public static void main(String args[])
    {
        ArrayList<BigInteger> list = new ArrayList<>();
        //String str=String.valueOf(list1);
        list.add(new BigInteger("34682832947923943298579834759843798592387839234325432"));
        list.add(new BigInteger("981234098240983298490321256847923049302843098932"));
        list.add(new BigInteger("734276432493298562374932487239434372445483594757"));
        list.add(new BigInteger("324497239490234093248092304203480932840328049832"));
        list.add(new BigInteger("1231323432143254354656765879045902945092835093853294879"));

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted ArrayList "
                + "in Descending order : "
                + list);

        //return null;
    }
}
