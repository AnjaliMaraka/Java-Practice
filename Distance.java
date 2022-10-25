import java.util.Scanner;
class Distance{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first point");
    int x1=sc.nextInt();
    System.out.println("enter the second point");
    int x2=sc.nextInt();
    System.out.println("enter the third point");
    int y1=sc.nextInt();
    System.out.println("enter the fourth point");
    int y2=sc.nextInt();
    int dis=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
    System.out.println("the distance between two points are:"+dis);
  }
}