package exception_handling;
//If an exception occurs at the particular statement in the try block, the rest of the block code will not execute.
// So, it is recommended not to keep the code in try block that will not throw an exception.
public class try_catch {


    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
            // if exception occurs, the remaining statement will not exceute
            System.out.println("rest of the code");
        }
        // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code after try catch");

    }

}