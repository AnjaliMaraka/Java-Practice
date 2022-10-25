import java.util.Scanner;
class CoI {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter principle ammount:");
    double p = sc.nextDouble();
    System.out.println("enter rate:");
    int r = sc.nextInt();
    System.out.println("enter time:");
    int t = sc.nextInt();
    double ci = p * (Math.pow((1 + r / 100), t)) - p;
    System.out.println("compound intrest: " + ci);
  }
}