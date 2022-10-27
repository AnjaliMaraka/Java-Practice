/*Write a JAVA program to input electricity unit charges and calculate total     electricity bill according to the given condition: 
    For first 50 units Rs. 0.50/unit 
    For next 100 units Rs. 0.75/unit 
    For next 100 units Rs. 1.20/unit 
     For unit above 250 Rs. 1.50/unit 
     An additional surcharge of 20% is added to the bill */
import java.util.*;
class ElectricityBill{
  public static void main(String args[]){
    double bill,surcharge;
    Scanner sc=new Scanner(System.in);
    System.out.println("The electricity unit charge");
    double eu=sc.nextDouble();
    if(eu<=50){
      bill=eu*0.5;
      System.out.println("the electricity bill is :"+bill);
    }
     else if(eu<=150){
      bill=25+(eu-50)*0.75;
      System.out.println("the electricity bill is :"+bill);
     }
     else if(eu<=250){
      bill=100+(eu-150)*1.20;
      System.out.println("the electricity bill is :"+bill);
    }
    else{
      bill=220+(eu-250)*1.50;
    }
    surcharge=bill*0.20;
    double tbill=bill+surcharge;
    System.out.println("Electricity bill = "+tbill);
  }
}