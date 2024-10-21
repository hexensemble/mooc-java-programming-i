
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Statistic> statistics = new ArrayList();

        System.out.println("File:");
        String fileName = scan.nextLine();

        try {
            Scanner file = new Scanner(Paths.get(fileName));

            while (file.hasNextLine()) {
                String[] parts = file.nextLine().split(",");

                Statistic statistic = new Statistic(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
                statistics.add(statistic);
            }

        } catch (IOException ex) {
            Logger.getLogger(SportStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        for (Statistic statistic : statistics) {
            if (statistic.getHomeTeam().equals(team) || statistic.getVisitingTeam().equals(team)) {
                games++;
            }

            if (statistic.getHomeTeam().equals(team)) {
                int homeTeamPoints = statistic.getHomeTeamPoints();
                int visitingTeamPoints = statistic.getVisitingTeamPoints();

                if (homeTeamPoints > visitingTeamPoints) {
                    wins++;
                } else {
                    losses++;
                }
            }

            if (statistic.getVisitingTeam().equals(team)) {
                int visitingTeamPoints = statistic.getVisitingTeamPoints();
                int homeTeamPoints = statistic.getHomeTeamPoints();

                if (visitingTeamPoints > homeTeamPoints) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
