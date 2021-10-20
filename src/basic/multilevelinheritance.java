public class multilevelinheritance {
    public static void main(String args[])
    {
        babydog g= new babydog();
        g.sleep();
        g.bark();
        g.eat();
    }
}
class animal
        {
        void eat()
        {
        System.out.println("eating");
        }

        }
class dog extends animal
{
    void bark()
    {
        System.out.println("barking");
    }

}
class babydog extends dog
{
    void sleep()
    {
        System.out.println("sleeping");
    }

}
