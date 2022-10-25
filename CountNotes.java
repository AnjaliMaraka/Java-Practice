//Write a JAVA program to count total number of notes in given amount.
import java.util.*;
class CountNotes{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("the total amount");
    int amount=sc.nextInt();
   int fcount= amount/500;//3
    amount=amount-fcount*500;//300
    System.out.println("500 notes are:"+fcount);
    int tcount=amount/200;//1
    amount=amount-tcount*200;
    System.out.println("200 notes are:"+tcount);
    int hcount=amount/100;
    amount=amount-hcount*100;
    System.out.println("100 notes are:"+hcount);
    
  }
}
    
   
