import java.util.*;
class FindFruit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String a[]={"Apple","banana","orange","grapes"};
    String name=sc.next();
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i].equals(name)){
        count++;
        break;
      }
      if(count==1){
        System.out.println("item is found");
      }
      if(count==1){
        System.out.println("item is found");
    }
  }
}