package Exercise3;
/*  Program created by Uchechi
    Date:   01/10/2020
    Time:   05:40 pm
*/


public class Ex3_13 {
    private String firstName;
    private String lastName;
    private double salary;

    public Ex3_13(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        if (salary > 0)
            this.salary = salary;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
