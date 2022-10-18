class compound{
  public static void main(String args[]){
    double p,r,t,ci;
    p=100000;r=5;t=3;
    ci=p*(Math.pow((1+r/100),t))-p;
    System.out.println("compound intrest: "+ci);
  }
}