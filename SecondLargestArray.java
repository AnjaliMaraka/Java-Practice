class SecondLargestArray{
  public void secondLargeArr(int arr[]){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
      if(max<arr[i]){
        max=arr[i];
        arr[i]=arr[j];
        arr[j]=max;
        
      }
    }
    }
    System.out.println(max);
  }
  public static void main(String args[]){
    SecondLargestArray sa=new SecondLargestArray();
    int array[]={3,8,9,6,12};
    sa.secondLargeArr(array);
  }
}