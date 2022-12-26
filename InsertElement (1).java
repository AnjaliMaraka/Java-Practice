import java.util.*;
class InsertElement{
  public void inserEle(){
    Scanner sc=new Scanner(System.in);
    int arr[]={11,22,33,55,77};
    System.out.println("enter position");
    int index=sc.nextInt();
    System.out.println("insert element");
    int element=sc.nextInt();
    for(int i=arr.length-1;i>=arr.length;i--){
      arr[i+1]=arr[i];
    }
    arr[index]=element;
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String args[]){
    InsertElement ie=new InsertElement();
    ie.inserEle();
  }
}