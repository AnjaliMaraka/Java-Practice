import java.util.Scanner;
class NoVariableSwap{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first value:");
    int a=sc.nextInt();
    System.out.println("enter second value");
    int b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("print a value:"+a);
    System.out.println("print b value: "+b);
  }
}