public class Employee{

    protected String name;
    protected String position;
    protected String email;
    protected String tnumber;
    protected int salary;
    protected int age;
    Employee(String n, String p, String e, String tn, int s, int a){
        this.name = n;
        position = p;
        email = e;
        tnumber = tn;
        salary = s;
        age = a;
    }
    void displayInfo(){
        System.out.println(name + " " + age + " " + position + " " + salary + " " + email + " " + tnumber);
    }
}