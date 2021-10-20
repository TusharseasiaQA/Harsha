package interfaces.src;
public class inter {
    public static void main(String args[])
    {
       impl i= new impl();
       // test i=new impl();
        i.show();

    }
}
interface test
{
    void show();
}
class impl implements test{
    public void show()
    {
        System.out.println("hi");
    }
}