//number is negative or not    
import java.util.*;
class NegativeNum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int num=sc.nextInt();
    if(num<0){
      System.out.println("it is a negative number");
    }
    else {
      System.out.println("it is not a negative number");
    }
  }
}