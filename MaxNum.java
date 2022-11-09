import java.util.*;
class MaxNum{
  public static void main(String args[])
  { 
    int a[]={324,121,454,456,678,153,371,698,728};
    int max=a[0],index=0;
    
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
        index=i;
      }
    }
      
    System.out.println("Max element is "+max+" found at "+ (index)+"th index");
    }
  }