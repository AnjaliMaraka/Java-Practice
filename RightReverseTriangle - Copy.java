import java.util.*;
class Sample{
  public static void main(String args[])
  { 
     int a=1;
     for(int i=0;i<5;i++)
       {
         for(int j=0;j<=i;j++){//j=0;1<=0
           System.out.print("  ");
         }
         for(int j=i;j<5;j++){
           System.out.print("* ");
         }

         
        System.out.println();       // * * * * *
       }                              // * * * *
                                        // * * * 
    }                                     // * *
  }                                     //     * 