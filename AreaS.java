import java.util.Scanner;
class AreaS{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the side: ");
    int s=sc.nextInt();
    int area=s*s;
    System.out.println("area of square "+area);
  } 
}