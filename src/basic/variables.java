public class variables {
    int a=25;//instance variable..different values for different instances

    static int c=30;//static variable..same value for various instances
    public static void main(String args[])
    {
        variables v1=new variables();
        variables v2=new variables();
        v1.a=10;
        v2.a=100;
        v1.c=35;
        int b=20;//local variable
        System.out.println(b);
        System.out.println(v1.a);
        System.out.println(v2.a);
        System.out.println(v2.c);
    }
}


