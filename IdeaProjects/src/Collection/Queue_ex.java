package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_ex {
    public static void main(String args[]) {
        PriorityQueue q = new PriorityQueue();
        q.add("A");
        q.add("B");
        q.add(100);//error,we cannot store heterogeneous data in priority queue
        q.offer("D");//offer is used to add an element
        System.out.println(q);
        System.out.println(q.element());//returns head element, returns exception if que empty
        System.out.println(q.peek());//returns head element, returns null if que empty
        //System.out.println(q.remove("C"));//removes element c
        System.out.println(q.remove());//returns and removes head element,gives exception if q empty
        System.out.println(q.poll());//returns and removes head element,returns null if empty
        System.out.println(q);
        Iterator it= q.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());

        }

        for( Object o:q)
        {
            System.out.println(o);
        }


    }




    }
