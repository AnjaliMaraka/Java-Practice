/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {
  //main method
  public static void main(String args[]){
    /*Use the scanner class to provide input at execution time using scanner object*/
    Scanner sc=new Scanner(System.in);
    //Take input from user
    System.out.println("Enter first number: ");
    int n1=sc.nextInt();
    System.out.println("Enter second number: ");
    int n2=sc.nextInt();
    //calculate difference,product,division,increment and remainder 
    int a=n1-n2;
    System.out.println("Difference of 2 numbers "+a);
    System.out.println("Enter first number: ");
    int s1=sc.nextInt();
    System.out.println("Enter second number: ");
    int s2=sc.nextInt();
    //calculate product
    int b=s1*s2;
    System.out.println("Product of 2 numbers "+b);
     System.out.println("Enter first number: ");
    int A1=sc.nextInt();
    System.out.println("Enter second number: ");
    int A2=sc.nextInt();
    //calculate division
    int c=A1/A2;
    System.out.println("Division of 2 numbers "+c);
    System.out.println("Enter the number: ");
    int B1=sc.nextInt();
    //calculate increment and decrement
    B1++;
    B1--;
    System.out.println("Increment and Decrement the number: "+B1);
    System.out.println("Enter first number: ");
    int C1=sc.nextInt();
    System.out.println("Enter second number: ");
    int C2=sc.nextInt();
    //calculate remainder 
    int f=C1%C2;
    System.out.println("Remainder of 2 numbers "+f);
  }
}