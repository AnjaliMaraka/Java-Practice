import java.util.*;
class SI {
  public static void main(String args[]){
    double p,t,r,si,total;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the principle ammount");
    p=sc.nextDouble();
    System.out.println("Enter the time");
    t=sc.nextDouble();
    System.out.println("Enter the rate");
    r=sc.nextDouble();
    si=(p*t*r)/100;
    total=(p+si);
    System.out.println(si);
    System.out.println(total);
  }
}