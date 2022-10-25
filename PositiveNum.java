// number is positive numer or not
//number is negative or not    
//number is zero or not
import java.util.*;
class PositiveNum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int num=sc.nextInt();
    if(num>0){
      System.out.println("it is a positive number");
    }
    else {
      System.out.println("it is not a positive number");
    }
  }
}