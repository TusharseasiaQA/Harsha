package exception_handling;

public class throw_example {
    static void fun()
    {
        try {

                throw new ArithmeticException();

            }
            catch (ArithmeticException e)
            {
                System.out.println("caught in fun");
                throw new NullPointerException();
            }
        }
        public static void main(String args[])
        {
            try{
                fun();
            }
            catch(NullPointerException e)
            {
                System.out.println("caught in main");
            }
    }
}
