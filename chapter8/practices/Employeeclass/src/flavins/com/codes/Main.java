package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    //show that count is 0 before creating Employees

        System.out.printf("Employees before instantiation: %d%n", Employee.getCount());

        //create two Employees; count should be 2
        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        //show that count is 2 after creating two Employees

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getFirstName());
    }
}
