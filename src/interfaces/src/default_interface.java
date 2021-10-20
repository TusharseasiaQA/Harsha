package interfaces.src;
public class default_interface {
    public static void main(String args[])
    {
        abc a= new test7();
        a.show();
        a.print();
    }

}
interface abc
{
    void show();
    default void print()
    {
        System.out.println("defgault method");
    }
}
class test7 implements abc{
    public void show()
    {
        System.out.println("methods of interfaces are abstract and public by deafault");
    }
}