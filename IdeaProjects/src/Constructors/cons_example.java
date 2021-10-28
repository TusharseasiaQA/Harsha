package Constructors;

public class cons_example {

public static void main(String args[])
{
    test t1= new test(2,3);
    test t2= new test(t1);
}
}
class test
{
    int a;
    int b;
    test(int x,int y)
    {
        a=x;
        b=y;
        System.out.println(a);
        System.out.println(b);
    }
    test(test c)
    {
        a=c.a;
        b=c.b;
        System.out.println(a);
        System.out.println(b);
    }
}
