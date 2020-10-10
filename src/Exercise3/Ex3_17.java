package Exercise3;
/*  Program created by Uchechi
    Date:   02/10/2020
    Time:   10:20 am
*/


public class Ex3_17 {

    private String firstName, lastName, gender;
    private int day, month, year, currentYear, height, weight;



    public Ex3_17(String firstName, String lastName, String gender, int month, int day, int year,int currentYear, int height, int weight) {

        this.firstName = firstName ;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.currentYear = currentYear;
        if (height > 0)
            this.height = height;
        if (weight > 0)
            this.weight = weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge(){
        return (this.currentYear - this.year);
    }

    public int getMaxHeartRate(){
        return (220 - getAge());
    }

    public String getTargetRate(){
        return ("Target Heart Rate between " + getMaxHeartRate()*0.5 + " and " + getMaxHeartRate()*0.85);
    }

    public double getBMI(){
        return (this.weight*703)/(this.height*this.height);
    }
}
