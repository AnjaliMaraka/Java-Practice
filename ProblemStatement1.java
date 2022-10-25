/*problem statement
Total cost of product

I went to shop I have purchased one AC  5 ton

what is the cost?

50000+28% GST

totalcost*/
//creating package
import java.util.Scanner;
//main class
class ProblemStatement1{
  //main method
  public static void main(String args[]){
    //creating object
    Scanner sc=new Scanner(System.in);
    //print cost
    System.out.println("enter the cost:");
    double c=sc.nextDouble();
    //print gst
    System.out.println("GST");
    double gst=sc.nextDouble();
    //formula for caliculating total cost
    double tc=c+((c*gst)/100);
    System.out.println("total cost:"+tc);
  }
}