//check whether number is divisble by 5 or not
import java.util.*;
class DivisibleBy5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num");
    int num=sc.nextInt();
    if(num%5==0){
      System.out.println("num is divisible by 5");
    }
    else{
      System.out.println("num is not divisible by 5");
    }
  }
}