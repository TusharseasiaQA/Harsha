
interface bank20
{
    void getrateofinterest();
}
 class sbi20 implements bank20
{
    public void getrateofinterest()//SINCE INTERFACE METHODS ARE PUBLIC BY DEFAULT,THEY HAVE TO BE DECLARED PUBLIC IN IMPLEMENTATION
    {
        System.out.println("7.5%");
    }
}
class canara20 implements bank20
{
    public void getrateofinterest()
    {
        System.out.println("7.0%");
    }
}

public class impl_inter  {

    public static void main(String args[]) {
        bank20 b = new sbi20();
        b.getrateofinterest();
      bank20 b2 = new canara20();
       b2.getrateofinterest();
    }


}


