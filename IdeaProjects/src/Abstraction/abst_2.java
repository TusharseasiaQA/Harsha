package Abstraction;

public class abst_2 {
    public static void main(String args[]) {
        bank b = new sbi();
        System.out.println(b.getrateofint());
        bank b1 = new pnb();
        System.out.println(b1.getrateofint());
    }
}

abstract class bank
{
    abstract int getrateofint();
}

class sbi extends bank {
    int getrateofint()
    {
        return(7);
    }
}

class pnb extends bank {
    int getrateofint()
    {
        return(8);
    }

}


























