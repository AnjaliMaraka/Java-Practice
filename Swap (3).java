import java.util.Scanner;
class Swap {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value:");
    int a=sc.nextInt();
    System.out.println("enter b value:");
    int b=sc.nextInt();
    int temp = a;
    a = b;
    b = temp;
    System.out.println("print a: " + a);
    System.out.println("print b: " + b);
  }
}