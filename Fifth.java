import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //scanner OBJECT

        String item;
        double price;
        int quantity;
        char currency = '$';
        double tatol;
       
        System.out.print("What Item you want to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price  = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        tatol = price * quantity;

        System.out.println("The total cost will be : "+ tatol + currency);

        scanner.close();
    }
}
