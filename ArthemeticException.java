/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers.
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
import java.util.*;
class ArthemeticException{
  public static void division(int a,int b){
    try{
      // ArithmeticException
      System.out.println(a/b);
    }
    catch(ArithmeticException e){
      e.printStackTrace();
    }
    System.out.println("Errors ");
  }
  public static void main(String args[]){
    division(10,0);
    
  }
}