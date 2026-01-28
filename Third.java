import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // format [ CLASS object = new CLASS(System.in); ] to take all system inputs

         System.out.print("Enter your name: ");
         String name = scanner.nextLine(); //takes line with spaces

         System.out.print("Enter your age: ");
         int age = scanner.nextInt();  // takes int
         scanner.nextLine(); // it is using as a input buffer for the \n if there is any 
         // this problem occours when ever we take an INT input then a line input 

         System.out.print("What is your GPA: ");
         double gpa = scanner.nextDouble(); //takes double

         System.out.print("Are You a student? (ture/false): ");
         boolean isStudent = scanner.nextBoolean(); // takes boolean

         System.out.println("My name is " + name);
         System.out.println("I am "+ age +" year's old");
         System.out.println("Your GPS is "+ gpa);

         if(isStudent){
               System.out.println("You are a student");
         }
         else{
            System.out.println("You are not a student");
         }

        scanner.close();  //closing the file
    }
}
