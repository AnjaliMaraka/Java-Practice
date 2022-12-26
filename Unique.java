class Unique{
  public void uniqueElement(int arr[]){
    
    for(int i=0;i<arr.length;i++){
      int count=0;
      for(int j=0;j<arr.length;j++)
      if(arr[i]==arr[j]){
        count++;
      }
      if(count==1){
        System.out.println(arr[i]);
      }
    }
  }
  public static void main(String args[]){
    Unique u=new Unique();
    int array[]={2,4,5,5,6,7,7,2};
    u.uniqueElement(array);
  }
}