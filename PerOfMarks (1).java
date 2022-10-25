class PerOfMarks{
  public static void main(String args[]){
    double sub1,sub2,sub3,total,avg;
    sub1=sc.nextDouble();
    sub2=sc.nextDouble();
    sub3=sc.nextDouble();
    total=sub1+sub2+sub3;
    avg=(total/300)*100;
    System.out.println("average marks of three subjects is: "+avg);
  }
}