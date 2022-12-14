// Interface find smallest element
 
//   1.method to find smllest number among 2 numbers
//   2.method to find smallest number among 3 memebers
//   3.method to find smallest number among array of elements
interface Small{
  public void amongTwo();
  public void amongThree();
  public void amongArr();
}
class Find implements Small{
  public void amongTwo(){
    int a=5;
    int b=8;
    if(a>b){
      System.out.println("Smallest number is "+b);
    }
    else{
      System.out.println("Smallest number is "+a);
    }
  } 
  public void amongThree(){
    int a=2;
    int b=8;
    int c=9;
    if(a>b&&a<c){
      System.out.println("Smallest number is "+b);
    }
    else if(b>a&&b<c){
      System.out.println("Smallest number is "+a);
    }
    else{
      System.out.println("Smallest number is "+c);
    }
  }
   public void amongArr(){
     int a[]={1,2,3,4,5};
     int min=a[0];
     for(int i=0;i<5;i++){
       if(a[i]<min)
         min=a[i];
     }
     System.out.println("Smallest number is "+min);
   }
}
class SmallEle{
  public static void main(String args[]){
    Small s=new Find();
    s.amongTwo();
    s.amongThree();
    s.amongArr();
  }
}