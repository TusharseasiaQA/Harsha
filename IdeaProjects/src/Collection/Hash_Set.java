package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String args[]) {


        HashSet hs = new HashSet();//stores heterogeneous data,normal declaratiom
        HashSet<String> hs2 = new HashSet<String>();
        HashSet hs4 = new HashSet(100);
        HashSet hs3 = new HashSet(100, (float) 0.95);
        hs.add("hi");
        hs.add("welcome");
        hs.add("to");
        hs.add("hashset");
        hs.add("class");
        System.out.println(hs);//insertion order is not maintained
        //hs.add(10);
        System.out.println(hs);
        hs.remove("welcome");
        System.out.println(hs);
        hs4.addAll(hs);
        System.out.println(hs4);
        System.out.println(hs4.contains(0));
        System.out.println(hs4.containsAll(hs));
        hs4.removeAll(hs);
        System.out.println(hs4);
        System.out.println(hs4.isEmpty());
    }
}
        /*for(Object o : hs)
        {
            System.out.println(o);

        }
        Iterator it= hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }*/




