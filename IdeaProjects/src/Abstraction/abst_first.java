package Abstraction;

public class abst_first
{
    public static void main(String args[]) {
        bike b = new honda();
            b.run();
            b.changegear();
    }
}

abstract class bike{
    bike()
    {
     System.out.println("bike is created");
    }
    abstract void run();// an abstract method doesnt have a body
    void changegear()
    {
        System.out.println("gear changed");
    }

}

class honda extends bike {
    void run()
    {
        System.out.println("abstract class cannot be instantiated");
    }
    honda() {
        System.out.println("honda bike created");
    //    super(); //when calling derived class constructor,base class is atomatically called
// but we have to call the base class constructor using super in case of parameterized constructoe
    }

}
