package basic;
public class heirarchichalinh
{
    public static void main(String args[])
    {
        babydogs g= new babydogs();
        g.sleep();
        //g.bark();
        g.eat();
    }
}
class animals
{
    void eat()
    {
        System.out.println("eating");
    }

}
class dogs extends animals
{
    void bark()
    {
        System.out.println("barking");
    }

}
class babydogs extends animals
{
    void sleep()
    {
        System.out.println("sleeping");
    }

}

