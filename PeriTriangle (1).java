import java.util.Scanner;
class PeriTriangle{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter s1 value:");
    int s1=sc.nextInt();
    System.out.println("enter s2 value");
    int s2=sc.nextInt();
    System.out.println("enter s3 value");
    int s3=sc.nextInt();
    double peri=(s1+s2+s3);
    System.out.println("perimeter of triangle is: "+peri);
  }
}