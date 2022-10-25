import java.util.Scanner;
class Quadratic{
  public static void main(String args[]){
    double a,b,c,result;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the a value");
    a=sc.nextDouble();
    System.out.println("Enter the b value");    
    b=sc.nextDouble();
    System.out.println("Enter the c value");
    c=sc.nextDouble();
    result=(b*b)-4*a*c;
    System.out.println("the equation is: "+result);
  }
}