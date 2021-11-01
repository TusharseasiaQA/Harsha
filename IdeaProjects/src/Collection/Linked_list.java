package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String args[])
    {
        LinkedList l1= new LinkedList();
        LinkedList <Integer> L2= new LinkedList<Integer>();
        L2.add(1);
        L2.add(10);
        L2.add(5);
        L2.add(3);
        L2.add(60);
        System.out.println(L2);
        System.out.println("Size of LL is " + L2.size()  );
        //L2.remove(1);
        //System.out.println("Size of LL is " + L2.size()  );
        //how to remove by passing an element
        L2.remove(new Integer (10));
        System.out.println(L2);

        L2.add(1,10);
        System.out.println(L2);
        L2.addFirst(100);
        L2.addLast(500);
        System.out.println(L2);
        L2.removeFirst();
        L2.removeLast();
        System.out.println(L2);
        System.out.println(L2.getFirst());
        System.out.println(L2.lastIndexOf(3));
        System.out.println(L2.get(1));
        L2.set(1,50);
        System.out.println(L2.isEmpty());
        System.out.println(L2.getLast());
        for(int i=0;i<L2.size();i++)
        {
            System.out.println(L2.get(i));
        }
        for(Object O:L2)
        {
            System.out.println(O);
        }
        Iterator<Integer> it = L2.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        l1.addAll(L2);
        System.out.println(l1);
        //l1.removeAll(L2);
        //System.out.println(l1);
        Collections.sort(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
        Collections.shuffle(l1);

        System.out.println(l1);
    }

}
