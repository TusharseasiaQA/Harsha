package Collection;

import java.util.*;

public class Array_List {
    public static void main(String args[]) {


    //declare arraylist object
    //ArrayList al = new ArrayList();//stores heterogeneous data
    //ArrayList <String>al = new ArrayList<String>(); //stores only string values
    //ArrayList <Integer>al = new ArrayList<Integer>();//stores integer values
    List al = new ArrayList();//another way of declaring
    //adding new elements
    al.add(100);
    al.add("hi");
        al.add(100);
    al.add("harsha");
    al.add(10.5);
    al.add(20);
    //al.add("Harsha");
    System.out.println(al);
        System.out.println("No. of elements are"+ al.size());
        al.remove(1);
        System.out.println(al);
        al.remove("harsha");//why cant remove numbers this way?
        System.out.println(al);
        //al.removeAll(al);
        //al.clear();//WhaT IS THE DIFFERENCE BETWEEN CLEAR AND REMOVE ALL?
        al.add(1,"harsha");
        System.out.println(al);
        al.set(1,"kapila");
        System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.isEmpty());
        System.out.println(al.contains(100));
        //reading data using for loop
        System.out.println("Printing using for loop");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        //reading data using for each loop
        System.out.println("Printing using for loop");
        for( Object O:al)
        {
            System.out.println(O);
        }
        //reading data using iterator method
        //iterator is a parent interface of collections
        //First we create an object of iterator interface an duse the method iterator present in arraylist
        Iterator it= al.iterator();//it extracts all the elements and store in it object
        System.out.println("Printing using iterator method");
        while(it.hasNext())
        {
            //it prints the element and moves to next element
            System.out.println(it.next());

        }
        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);
        //al_dup.removeAll(al);
        //System.out.println(al_dup);
        //sorting
        //Collections.sort(al);
        //Collections.sort(al,Collections.reverseOrder());
        //System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
        String arr[] = {"cat","dog","horse"};
        //converting array into arraylist
        ArrayList a = new ArrayList(Arrays.asList(arr));
        System.out.println(a);

}






}
