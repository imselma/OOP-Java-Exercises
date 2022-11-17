import java.util.ArrayList;

import java.util.ArrayList;
public class Team {

    private String name;

    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name){
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize=16;
      
    }

    public String getName (){
        return this.name;
    }

    public void addPlayer (Player player){
        players.add(player);
    }

    public void printPlayers() {

        for(Player player : this.players){

            System.out.println(player);
        }
        
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size (){
        return this.players.size();
    }

    public Integer goals(){

        int sumOfGoals=0;
        for(int i=0; i<this.players.size();i++){

            sumOfGoals+=(this.players.get(i)).getGoals();
        }

        return sumOfGoals;

    }



}
