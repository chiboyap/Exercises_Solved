package Exercise3;
/*  Program created by Uchechi
    Date:   01/10/2020
    Time:   06:40 pm
*/


public class Ex3_14 {
    private int day, month, year;

    public Ex3_14(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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

    public void dateDisplay(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}

