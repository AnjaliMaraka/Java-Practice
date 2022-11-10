import java.util.*;

class EvenOdd {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("Even Numbers:");  
      for(int i=0;i<a.length;i++){  
        if(a[i]%2==0){  
        System.out.println(a[i]);  
    }
      
  }
    System.out.println("odd Numbers:");  
      for(int i=0;i<a.length;i++){  
        if(a[i]%2!=0){  
        System.out.println(a[i]);
        }
      }
  }
}