//import java.lang.Object;
import java.util.Arrays;

public class arr {

        public static void main(String args[])
        {
            int a[];//declaration of an array, no memory is allocated,only a reference is created
             a =new int[5];//allocating memory to the array
          // or int a[]=new int[5];

            int b[]={5,30,4,6,7,};//initializing at the time of declaration
            int c[]={56,43,89,21,87};
            //System.out.println(Arrays.compare(b,c));
            System.out.println("Displaying all elements of an array using tostring method");
            System.out.println(Arrays.toString(b));
            System.out.println("Displaying all elements after copying to another array");
            int d[]=Arrays.copyOf(b,5);
            //System.out.println("Displaying all elements of an array using tostring method");
            System.out.println(Arrays.toString(d));
            Arrays.sort(b);//it just sorts array and does not return anything,sorts in ascending order
            System.out.println("Displaying elements after sorting"+Arrays.toString(b));
            System.out.println("Element 7  found at"+ Arrays.binarySearch(b,7));
            Arrays.sort(c,0,4);
            System.out.println("Displaying elements after sorting"+Arrays.toString(c));
            System.out.println(Arrays.equals(b,c));
            Arrays.fill(b,5);
            System.out.println(Arrays.toString(b));



        }
    }

