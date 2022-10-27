//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=37
   

*/

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle {
  // Define main method
  public static void main(String args[]) {
    // Declare the variables
    int radius;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter radius of the circle");
    radius = scanner.nextInt();
    // Caluculate the circumference of the circle
    float pie = 3.14f;
    double cc = 2 * pie * radius;
    // Casting the floating-point value to int
     int newcc = (int) cc;
    // Print the Result
    System.out.println("Circumference of a circle is: " + newcc);
  }
}