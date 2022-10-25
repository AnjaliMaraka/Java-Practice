//4.Write a JAVA program to input week number and print week day.
import java.util.*;
class WeekDay{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the week number: ");
    int wn=sc.nextInt();
    if(wn==1){
      System.out.println("this is sunday");   
    }
    else if(wn==2){
      System.out.println("this is monday");
    }
    else if(wn==3){
      System.out.println("this is Tuesday");
    }
    else if(wn==4){
      System.out.println("this is Wednes");
    }
    else if(wn==5){
      System.out.println("this is Thursday");
    }
    else if(wn==6){
      System.out.println("this is Friday");
    }
    else if(wn==7){
      System.out.println("this is Saturday");
    }
  }
}

  