package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LHashSet {
    public static void main(String args[]) {



        LinkedHashSet set1 = new LinkedHashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);//insertion order is preserved
}}
