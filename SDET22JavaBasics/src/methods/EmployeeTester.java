package methods;

public class EmployeeTester {
    public static void main(String[] args) {

        Employee e1=new Employee();
    e1.name="Godwin Don";
    e1.salary=-20000;

    Employee e2=new Employee();
    e2.name="Gianna Richards";
    e2.salary=1500000;

        System.out.println(e1.CEO);
        System.out.println(e2.CEO);
        System.out.println(Employee.CEO);
        System.out.println(e1.name);
        System.out.println(e2.name);
        Employee.printCEO();
    }
}
