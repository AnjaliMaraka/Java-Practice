import java.util.Scanner;
class KmtoM{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter km:");
    int km=sc.nextInt();
    int m=km*1000;
    System.out.println("convert km to m is: "+m);
  }
}