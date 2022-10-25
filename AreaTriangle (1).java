import java.util.Scanner;
class AreaTriangle{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter breath: ");
    int b=sc.nextInt();
    System.out.println("enter height: ");
    int h=sc.nextInt();
    double area=(b*h)/2;
    System.out.println("area of triangle is: "+area);
  }
}