//number is zero or not
import java.util.*;
class EqualToZero{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int num=sc.nextInt();
    if(num==0){
      System.out.println("it is a zero");
    }
    else {
      System.out.println("it is not a zero");
    }
  }
}