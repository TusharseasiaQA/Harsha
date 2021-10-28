package interfaces.src;
public class inter2 {
    public static void main(String args[])
    {
        impl1 i= new impl1();

        i.printing();
        i.drawing();

    }

}
interface print
{
    void printing();
}
interface draw extends print
{
    void drawing();
}
class impl1 implements print,draw{
    public void printing()
    {
        System.out.println("implementing print interface");
    }
    public void drawing()
    {
        System.out.println("implementing draw interface");
    }

}