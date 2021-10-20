package basic;

public class str {

    public static void main(String args[]) {
        String s= "Harsha";
        String s1= new String ("Harsha");
        String s2=s1.concat(" Kapila");
        char a=s.charAt(1);
        int l= s1.length();

        String s3= s1.substring(0);
        String s4= s1.substring(1,3);
        String s5= "Vikas";
        String s6="              Kapila";
        String s7=s5+s6;
        boolean b= s1.equals(s);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(a);
        System.out.println(l);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s7);
        System.out.println(b);
        System.out.println(s6.trim());
        System.out.println(s.indexOf('H'));

    }

}
