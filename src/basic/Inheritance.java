import static java.lang.System.*;

public class Inheritance {
public static void main(String args[])
{
    alto a=new alto(2,60,4);
    //a.show();

    a.applybrake(10);
    a.show1();
}

}
class car
{
    int gear,speed;
    car(int g,int s)
    {
        this.gear=g;
        this.speed=s;
    }
    void applybrake(int dec)
    {
        speed-=dec;

    }
    void speedup(int inc)
    {
        speed+=inc;
    }
    void show()
    {
        System.out.println("gear " +gear);
        System.out.println("speed "+speed);

    }

}
class alto extends car
{
    int height;
    alto(int g,int s,int h)
    {
        super(g,s);
        height=h;
    }
    public void show1()
    {
        super.show();
        System.out.println(height);

    }
}
