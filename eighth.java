import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
            
            //compound intreset calculator

            Scanner scanner = new Scanner(System.in);

            double principal;
            double rate;
            int timesCompounded;
            int year;
            double ammount;

            String name = "rafi alam";

            System.out.print("Enter the principle ammound: "); // just like the C printf function
            principal = scanner.nextDouble();

            System.out.print("Enter the intrest rate (in %): ");
            rate = scanner.nextDouble()/100;

            System.out.print("Enter the Number of time compounded per year: ");
            timesCompounded = scanner.nextInt();

            System.out.print("Enter the Number of years: ");
            year = scanner.nextInt();

            //this is the formula of the interest rate 
            ammount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * year);

            System.out.printf("The accmount after %d is $: %.2f ",year, ammount);

            scanner.close();
    }
}
