package exception_handling;
// throwing unchecked exception
public class throw_usage {
    public static void main(String args[])
    {
        abc.validate();
    }
}
class abc
{
    public static void validate()
    {
        int age =2;
        if (age<18)
            try {
                throw new ArithmeticException("not eligible"); //("Person isnt eligible to vote");
            }//if you want to print message of throw dont put try catch block
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        else
            System.out.println("person can vote");
    }

}
