import java.lang.Object;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class loops
{
    public static void main(String args[])
    {
        int a[] = new int[10];
        int b[]={20,87,28,12};
        int c[]={20,87,28,12};
        //assigning values to an  array
        for (int i = 0; i < 5; i++)
        {
            a[i] = i + 2;
        }
        System.out.println("Displaying the values of an array");
        for (int i = 0; i < 5; i++)
        {
           System.out.println(a[i]);
        }
        System.out.println("Checking if the arrays are equal or not!");
        System.out.println(Arrays.equals(b,c));
        int i=0;
        int sum=0;

        //Finding the sum of an array
        do
        {
            sum = sum + a[i];
            //System.out.println("hi");
            i=i+1;
        }

        while(i<5);
        System.out.println("Sum of an array is"+sum);
        int j=0;
        int sum1=0;
        while(j<5)
        {
            sum1 = sum1 + a[j];
            //System.out.println("hi");
            j=j+1;
        }


        System.out.println("Sum of another array is"+sum1);




    }

}
