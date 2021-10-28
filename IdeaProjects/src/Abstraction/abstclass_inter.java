package Abstraction;

public class abstclass_inter {
    public static void main(String args[])
    {
        A a1= new C();
        a1.a();
        a1.b();
        a1.c();
        a1.d();
    }
}

interface A
{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A
{
   public void a()
    {
        System.out.println("hi, i am a");
    }
}

class C extends B {
    public void b()
    {
        System.out.println("hi, i am b");
    }
    public void c()
    {
        System.out.println("hi, i am c");
    }
    public void d()
    {
        System.out.println("hi, i am d");
    }
}