package mooc.week1.Ex23_Temperature;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Ex24_NhlStatics2 {

    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {

            System.out.println("");
            System.out.print("Menu options: points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                // print the top ten playes sorted by points
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);

            } else if (command.equals("goals")) {
                // print the top ten players sorted by goals
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                // print the top ten players sorted by assists
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);

            } else if (command.equals("penalties")) {
                // print the top ten players sorted by penalties
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);

            } else if (command.equals("player")) {
                // ask the user for the player name and print the statistics for that player

                System.out.println("Please enter the player name : " );
                String playerName = reader.nextLine();
                NHLStatistics.searchByPlayer(playerName);

            } else if (command.equals("club")) {
                // ask the user for the club abbreviation and print the statistics for the club
                // note: the statistics should be sorted by points
                //     (players with the most points are first)

                System.out.println("Please enter the club abbreviation : ");
                String clubAbbreviation = reader.nextLine();

                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(clubAbbreviation);
            }
        }
    }
}
