import java.util.*;
class ProductSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numer");
    int n=sc.nextInt();
    int prod=1,rem;
    int last_digit=n%10;
    while(n>=9){
      n=n/10;
    }
    int first_digit=n;
    int sum=first_digit+last_digit;
    System.out.println(sum);
  }
}