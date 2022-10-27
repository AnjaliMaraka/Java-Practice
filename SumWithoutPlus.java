/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class SumWithoutPlus {
//main method
  public static void main(String args[]){
    //Use the scanner class to provide input at execution time using scanner object
    Scanner sc=new Scanner(System.in);
    //Take input from user
    System.out.println("Enter First Number: ");
    int n1=sc.nextInt();
    System.out.println("Enter Second Number: ");
    int n2=sc.nextInt();
    //check if the second number is greater than zero then increase first number and decrease second number
    if(n2>0){
      n1=n1++;
      n2=n2--;
      //print result
      System.out.println("The sum of two numbers is: "+(n1+n2));
    }
      //check if the second number is less than zero then decrease first number and increase second number
    else{
      n1=n1--;
      n2=n2++;
      //print result
      System.out.println("The sum of two numbers is: "+(n1+n2));
    }
  }
}