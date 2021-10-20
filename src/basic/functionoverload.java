package basic;
public class functionoverload {
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

}
class test10
{
    public static void main(String args[])
    {
        functionoverload a= new functionoverload();
        a.sum(2,3);
        a.sum(1,2,3);
    }
}
