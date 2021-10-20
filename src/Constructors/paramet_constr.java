package Constructors;

public class paramet_constr
{
    public static void main()
    {
        student s= new student(101,"harsha");
    }
}
class student
{
    int id;
    String name;
    student(int i,String n)
    {
        id=i;
        name=n;
    }

}
