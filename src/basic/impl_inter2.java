package basic;
interface x {
    void p();
    //public static  int m=7;
}
class y implements x
{
      public  void p() {
          System.out.println("hi");

      }
  }


    public class impl_inter2 {
        public static void main(String args[]) {
            y b1 = new y();
            b1.p();
        }
    }

