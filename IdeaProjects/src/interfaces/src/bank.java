package interfaces.src;

interface bank1
{
    void getrateofinterest();
    int a=10;
}
class sbi implements bank1
{
    public void getrateofinterest()//SINCE INTERFACE METHODS ARE PUBLIC BY DEFAULT,THEY HAVE TO BE DECLARED PUBLIC IN IMPLEMENTATION
    {
      int b=  a+20;
        System.out.println(a);
    }
}
class canara implements bank1
{
    public void getrateofinterest()
    {
        System.out.println("7.0%");
    }
}

public class bank {

    public static void main(String args[]) {
        sbi b = new sbi();
        b.getrateofinterest();
        bank1 b2 = new canara();
        b2.getrateofinterest();
    }
}





