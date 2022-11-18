//create a class game having the attributes no.of players in that game ang name of the game
//another class kabaddi,and display that name of the game and no of players in both the games
class Game{
  int noPlayers;
  String name;
  Game(int noPlayers,String name){
    this.noPlayers=noPlayers;
    this.name=name;
  }
}
class Kabaddi extends Game{
  
 Kabaddi(int noPlayers,String name){
   super(noPlayers,name);
    // this.noPlayers=noPlayers;
    // this.name=name;
    }
  void display(){
    System.out.println("name of the game is "+name);
    System.out.println("number of players "+noPlayers);
}
}
class Cricket extends Game{
  
Cricket(int noPlayers,String name){
  super(noPlayers,name);
    // this.noPlayers=noPlayers;
    // this.name=name;
}
  void display(){
    System.out.println("name of the game is "+name);
    System.out.println("number of players "+noPlayers);
  }
}
class Game1{
  public static void main(String args[]){
  Cricket c=new Cricket(11,"Cricket");
  c.display();
  Kabaddi k=new Kabaddi(7,"kabaddi");
  k.display();
  }
}
  
 