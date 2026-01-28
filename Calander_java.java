
import java.util.Scanner;

class CalendarApp {

    private int year;
    private int month;
    private int days;
    private int startDay;

    // Constructor
    CalendarApp(int year, int month) {
        this.year = year;
        this.month = month;
    }

    // Proper leap year check
    boolean isLeapYear() {
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }

    // Calculate days in month
    void calculateDaysInMonth() {

        if (month == 2) {
            if(isLeapYear()){
                days = 29;
            }
            else{
                days = 28;
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        else {
            days = 31;
        }
    }

    // Calculate starting day of the month
    void calculateStartDay() {

        startDay = year + year / 4 - year / 100 + year / 400;

        for (int i = 1; i < month; i++) {

            if (i == 2)
                if(isLeapYear()){
                    startDay += 29;
                }
                else{
                    startDay += 28;
                }

            else if (i == 4 || i == 6 || i == 9 || i == 11)
                startDay += 30;

            else
                startDay += 31;
        }

        startDay = startDay % 7;
    }

    // Display calendar
    void displayCalendar() {

        System.out.println("\nSun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        for (int i = 1; i <= days; i++) {

            System.out.printf("%3d ", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
    }
}

// MAIN CLASS (must be in a class)
public class Calander_java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        // Create object
        CalendarApp cal = new CalendarApp(year, month);

        cal.calculateDaysInMonth();
        cal.calculateStartDay();
        cal.displayCalendar();

        sc.close();
    }
}
