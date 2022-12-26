class Count{
  public void oddCount(int arr[]){
    int countodd=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==1){
        countodd++;
      }
    }
    System.out.println(countodd);
  }
  public void evenCount(int arr[]){
    int counteven=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        counteven++;
      }
    }
    System.out.println(counteven);
  }
  public void negativCount(int arr[]){
    int countnegative=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<0){
        countnegative++;
      }
    }
    System.out.println(countnegative);
  }
  public static void main(String args[]){
    Count c=new Count();
    int array[]={2,4,6,1,3,7,-7,-3};
    c.oddCount(array);
    c.evenCount(array);
    c.negativCount(array);
  }
}