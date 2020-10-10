package Exercise3;
/*  Program created by Uchechi
    Date:   27/09/2020
    Time:   10:15 pm
*/


public class Ex3_16 {

    private String firstName, lastName;
    private int month, day, year, currentyear;

    public Ex3_16(String firstName, String lastName, int month, int day, int year, int currentyear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
        this.currentyear = currentyear;



    }



    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setYear(int year){
        this.year = year;
    }
    public void setCurrentyear(int currentyear){
        this.currentyear = currentyear;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public int getCurrentyear() {
        return currentyear;
    }

    public int getYear(){
        return this.year;
    }

    public int getAge(){
        return (this.currentyear-this.year);
    }

    public int getMaxHeartRate(){
        return (220 - getAge());
    }

    public String getTargetRate(){
        return ("Target Heart Rate between " + getMaxHeartRate()*0.5 + " and " + getMaxHeartRate()*0.85);
    }

}
