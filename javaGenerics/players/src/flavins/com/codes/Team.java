package flavins.com.codes;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;


    private ArrayList<T>members = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

   public boolean addPlayer(T player){
        if(members.contains(player.getName())){
            System.out.println(player.getName() + " is already present");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " has been signed by team " + this.name);
            return true;
        }

   }


   public int numPlayers(){
        return this.members.size();
   }

   public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        }else if(ourScore == theirScore){
            tied++;
        }else{
            lost++;
        }if(opponent!=null){
            opponent.matchResult(null, theirScore, ourScore);
       }
   }


   public int ranking(){
        return (2 * won) + tied;
   }


    @Override
    public int compareTo(Team<T> tTeam) {
        if(this.ranking() < tTeam.ranking()){
            return -1;
        }else if(this.ranking()>tTeam.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
