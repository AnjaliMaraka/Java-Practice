import java.util.*;
class SumSquares{
  public static void main(String args[]){
    int n1,n2,sum,sumofsquares;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n1 value");
    n1=sc.nextInt();
    System.out.println("Enter the n2 value");
    n2=sc.nextInt();
    sum=n1+n2;
    sumofsquares=sum*sum;
    System.out.println(sumofsquares);
  }
}