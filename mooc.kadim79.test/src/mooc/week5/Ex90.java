package mooc.week5;

import java.util.ArrayList;

public class Ex90 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());

        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);

        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);

        barcelona.setMaxSize(2);

        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        barcelona.printPlayers();

        barcelona.printPlayers();
        
        System.out.println("Number of players: " + barcelona.size());

        System.out.println("The "+barcelona.getName()+ " have scored "+
                barcelona.teamGoals()+ " goals!");
    }
}

class Team{

    private String name;
    private ArrayList<Player> playerList;
    private int maxSizeTeam = 16;

    public Team(String name) {
        this.name = name;
        this.playerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        if(player==null)
            System.exit(-1);
        else if(playerList.size()== maxSizeTeam)
        {
            System.out.println("Your doesn't have place for new player!");
            return;
        }
        else
            playerList.add(player);
    }

    public void printPlayers(){
        for (Player player : playerList) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int newMaxSizeTeam) {

        if(newMaxSizeTeam<playerList.size())
        {System.out.println("Please change the team composition to " +
                     + newMaxSizeTeam + " players. Then come back and run " +
                      "again this method!");
        return;
        }
        else
            this.maxSizeTeam = newMaxSizeTeam;
    }

    public int size() {
        return playerList.size();
    }

    public int teamGoals(){
        int teamGoals = 0;

        for (Player player:playerList) {
            teamGoals += player.getGoals();
        }

        return teamGoals;
    }
}

class Player{

    private String name;
    private int goals;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    @Override
    public String toString() {
        if(goals==0)
            return name + ", goals not setted";
        else
            return name + ", goals " + goals;
    }
}
