
public class Second {
       public static void main(String[] args) {
           
        // java has primiaive variables like (int, double, char, boolean)
        // Reference variables are (string, array, object)
    
        // Primitaive  directly in memory (stack)
        // feferenxe has the memory address (stack ) that point to the ( heap)

        // 2- steps to create a variable 1. declaration 2. assignment

        int age = 23;
        int year = 2026;
        int quantity = 2;

        System.out.println("My age is " + age);
        System.out.println("the year is " + year);
        System.out.println("I have " + quantity + " laptops" );

        double price = 20.99;
        double gpa = 3.50;
        double temp = -44.7;

        System.out.println("$"  + price);
        System.out.println(gpa);
        System.out.println(temp);

        char grade = 'A';
        System.out.println(grade);

        boolean isStudent = true;
        // boolean forSale = false;
        // boolean isOnline = true;

        if(isStudent){
        System.out.println("your are a Student! ");
        }
        else{
            System.out.println("you are not a student");
        }
        
        String name = "Rafi alam";

        System.out.println("hello " + name);

       }
}
