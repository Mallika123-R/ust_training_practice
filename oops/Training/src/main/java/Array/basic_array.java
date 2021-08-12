package Array;

public class basic_array {

    public static void main(String[] args) {
        int[] arr = new int[]{45, 56, 23, 89, 54};

        //print the array elements
        for (int i = 0; i < arr.length; i++) {

            System.out.println("arr [" +i+ "]" +arr[i]);

        }
        //print the array in reverse order
        for(int i=arr.length-1; i>0; i--)
        {
            System.out.println("arr [" +i+ "]" +arr[i]);
        }

        //sum of array
        int sum=0;
        for(int i=0;i<arr.length; i++)
        {
            sum=sum+arr[i];

        }
        System.out.println("sum of array: "+sum);

        //sum of even and odd
        int evenno =arr[0];
        int oddno=arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                evenno=evenno+arr[i];
            }
            else
            {
                oddno=oddno+arr[i];
            }
        }
        System.out.println("sum of even no: "+evenno);
        System.out.println("sum of odd no.: "+oddno);

        //to find key
        int key=56;
        boolean flag=false;
        for(int x: arr)
        {
            if(key==x)
            {
                flag=true;
                break;
            }
        }
          if(flag)
          {
              System.out.println(key+ "element is found");
          }
          else
              System.out.println(key+"element is not found");

    }
}
