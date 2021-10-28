package basic;
public class Employee {
    String name, dept;
    int age, emp_id, salary;

    Employee() {

    }

    Employee(String n, String d, int a, int id, int s) {
        this.name = n;
        this.emp_id = id;
        this.dept = d;
        this.age = a;
        this.salary = s;
    }

    void putdata(String n, String d, int a, int id, int s) {
        name = n;
        dept = d;
        age = a;
        emp_id = id;
        salary = s;
    }

    String getname() {
        return name;
    }

    String getDept() {
        return dept;
    }

    int getage() {
        return age;
    }

    int getEmp_id() {
        return emp_id;

    }

    int getSalary() {
        return salary;
    }

}
class manager{
    public static void main(String args[])
    {
        Employee e1= new Employee();
        System.out.println("printing the values of Employee 1");
        Employee e2=new Employee("rahil","HK",35,102,300000);
        e1.putdata("Harsha","IT",30,101,200000);
        System.out.println("The name of the employee is "+e1.getname() +"\n Department is " + e1.getDept()+"\n Age is " + e1.getage()
                +"\n Salary is " + e1.getSalary()+"\n empid  is " + e1.getEmp_id());
        System.out.println("printing the values of Employee 2");
        System.out.println("The name of the employee is "+ e2.getname() +"\n Department is " + e2.getDept()+"\n Age is " + e2.getage()
                +"\n Salary is " + e2.getSalary()+"\n empid  is " + e2.getEmp_id());

    }
}
