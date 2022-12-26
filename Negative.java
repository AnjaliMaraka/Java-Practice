import java.util.*;
class Negative{
  public void negativArray(){
    Scanner sc=new Scanner(System.in);
    System.out.println("size of array");
    int n=sc.nextInt();
    System.out.println("enter elements");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(arr[i]<0){
        System.out.println(arr[i]);
      }
    }
    
  }
  public static void main(String args[]){
    Negative ne=new Negative();
    ne.negativArray();
  }
}