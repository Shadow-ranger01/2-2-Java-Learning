import java.util.Scanner;
import java.util.Random;

public class seventh {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println(Math.PI); // Pie number
        System.out.println(Math.E); // exponent constent

        double a = 8;
        double b = 10;
        double c;
        double result;

        result = Math.pow(2, 4);   // power
        result = Math.abs(-5);          // absuluter or the posative number of the negative number is
        result = Math.sqrt(9) ;       // root
        result = Math.round(3.14);   // this will output the number outsite of the ponts
        result = Math.ceil(3.001);   // thsi will output the next number 
        result = Math.floor(3.90);  // this will output the low nubmer
        result = Math.max(10, 11); // output the max
        result = Math.min(100, 120);  // output the lowest number
        
        result = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.print(result);

        scanner.close();
    }
}
