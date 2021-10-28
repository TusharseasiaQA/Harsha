package exception_handling;

public class multiple_catch_block {

    public static void main(String args[])
    {
        try
        {
         //   int i=10/0;
        int i[] = new int [5];
        i[6]=23;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        {

            System.out.println("Finally block is always executed");
        }
    }


}
