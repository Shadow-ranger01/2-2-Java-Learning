import java.util.Scanner;

public class Program1 {
     public static void main(String[] args) {
        
             // Calculate area fo a rectangle

             double width = 0;
             double height = 0;
             double area = 0;

             Scanner scanner = new Scanner(System.in);

             System.out.println("Enter the Width: ");
             width = scanner.nextDouble();

             System.out.println("Enter the Hight: ");
             height = scanner.nextDouble();

             area = width * height;

             System.out.println("The area is : "+ area + "cm^2");


             scanner.close();
     }

}
