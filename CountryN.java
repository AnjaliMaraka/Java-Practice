import java.util.*;
class City{
  String cityname;
  City(String cityname){
    this.cityname=cityname;
  }
}
class State{
  String sname;
  City city[]=new City[5];
  State(String sname,City city[]){
    this.sname=sname;
    this.city=city;
  }
}
class Country{
  String cname;
  State state;
  Country(String cname,State state){
    this.cname=cname;
    this.state=state;
  }
  
}
class CountryN{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    City city[]=new City[5];
    System.out.println("Enyter Cityname");
    for(int i=0;i<5;i++){
      city[i]=new City(sc.next());
    }
    State state=new State("Ap",city);
    Country country=new Country("India",state);
    System.out.println("Country is: "+country.cname);
    System.out.println("State is: "+state.sname);
    System.out.println("cities are: ");
    for(int i=0;i<5;i++){
      System.out.println(city[i].cityname);
    }
    
  }
}