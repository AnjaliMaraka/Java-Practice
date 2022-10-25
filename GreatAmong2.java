//find greatest number among 2 numbers
import java.util.*;
class GreatAmong2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the 1st num");
    int n1=sc.nextInt();
    System.out.println("enter the 2nd num");
    int n2=sc.nextInt();
    if(n1>n2){
      System.out.println("1st num is greater "+n1);
    }
    else{
      System.out.println("2nd num is greater "+n2);
    }
    
    
  }
}