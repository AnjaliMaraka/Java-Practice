import java.util.*;
class DepriciationRate{
  public static void main(String args[]){
    double depriciation_rate=5;
    double initial_cost=5000;
    double year=5;
    for(int i=0;i<year;i++){
      initial_cost=((100-depriciation_rate)*initial_cost)/100;
      System.out.println(initial_cost);
    }
  }
}