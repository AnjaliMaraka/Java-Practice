// Football player
// name
// football

// Football
// type
// size
// weight
import java.util.*;
class Football{
  String type;
  int size;
  int weight;
  Football(String type,int size,int weight){
    this.type=type;
    this.size=size;
    this.weight=weight;
  }
} 
class FootballPlayer{
  String name;
  Football football;
  FootballPlayer(String name,Football football){
    this.name=name;
  }
}
class FootBall{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Football football=new Football("indoor",23,5);
    FootballPlayer footballplayer=new FootballPlayer("Hani",football);
    System.out.println(football.type+" "+football.size+" "+football.weight);
    System.out.println(footballplayer.name);
  }
}