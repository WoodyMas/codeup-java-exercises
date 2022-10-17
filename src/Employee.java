public class Employee {
    //Create an Employee class.
    // The employee class should have a name instance variable, a static company variable set to Veridian Dynamics, and a non-static method displayEmployeeInfo().
    // displayEmployeeInfo() should generate a string, name + " works at " + company. Create a test class that instantiates three employee objects with different names.
    // Run displayEmployeeInfo on all of them to show that each has access to the employee static variable. Bonus: write a method that has the employee emit a random quote and test it.

    public String name;
    public static String company = "Veridian Dynamics";

    public String displayEmployeeInfo(){
        return name + " works at " + company;
    }


}
