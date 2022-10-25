import java.util.Scanner;
class DisBwPoint {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x1 value: ");
    int x1 = sc.nextInt();
    System.out.println("Enter x2 value: ");
    int x2 = sc.nextInt();
    System.out.println("Enter y1 value: ");
    int y1 = sc.nextInt();
    System.out.println("Enter y2 value: ");
    int y2 = sc.nextInt();
    double dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    System.out.println("distance between two points (" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + "):" + dis);
  }
}