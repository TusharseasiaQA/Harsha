package Collection;

import java.util.HashSet;

public class Hash_SET2 {
    public static void main(String args[]) {



        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        HashSet set2 = new HashSet(100);
        set2.add(8);
        set2.add(7);
        set2.add(6);
        set2.add(1);
        System.out.println(set2);
        //union

        set1.addAll(set2);
        System.out.println("Union of both");
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println("Difference");
        System.out.println(set1);
        set1.addAll(set2);

        System.out.println("Intersection");
        System.out.println("set1 " +set1);
        System.out.println("set1 "+ set2);
        set1.retainAll(set2);
        System.out.println(set1);//insertion order is not maintained

    }}
