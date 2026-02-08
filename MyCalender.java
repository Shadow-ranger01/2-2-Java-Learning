import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter year (e.g., 2026): ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    static void printMonth(int year, int month) {
        // We use month - 1 because Java's Calendar class is 0-indexed (Jan = 0)
        // Classic Java quirk!
        Calendar cal = new GregorianCalendar(year, month - 1, 1);

        String monthName = getMonthName(month);

        // Header UI
        System.out.println("\n      " + monthName + " " + year);
        System.out.println("---------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Figure out where the first day of the month starts
        int startDay = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print initial spaces to align the first day correctly
        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print the actual days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);

            // If we hit Saturday, jump to the next line
            if ((day + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n---------------------------");
    }

    static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
}
