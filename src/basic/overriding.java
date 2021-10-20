public class overriding {
    public static void main(String args[])
    {
       // b c1= new b();
        //c1.show();
        b c2=  new b();//reference of base class can be used to refer to memory location of any derived class
        c2.show();
        //but reference variable of the derived class cannot be used to refer to the memory area of base class
    }
}
class a
{
    void show() {
        System.out.println("class a");
    }
}
class b extends a
{
    void show()
    {
        System.out.println("class b");
    }
}
class c extends b
{
    void show()
    {
        System.out.println("class c");
    }
}