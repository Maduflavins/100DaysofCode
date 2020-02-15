package flavins.com.codes;

public class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;

    //initialize Employee, add 1 to static count and output String indicating that the constructor was called

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count; //increament static count of employees

        System.out.printf("Employee constructor: %s %s; count = %d%n,", firstName, lastName, count);
    }

    //get first name
    public String getFirstName(){
        return firstName;
    }

    //get last name
    public String getLastName(){
        return lastName;
    }

    //sataic method to get static count value
    public static int getCount(){
        return count;
    }
}
