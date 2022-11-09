class CountNegNum{
  public static void main(String args[]){
    int a[]={2,-3,4,-5,-7,9,-1};
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]<0){
        count++;
      }
    }
    System.out.println(count);
  }
}