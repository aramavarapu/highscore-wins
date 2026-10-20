package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;
public class HighscoreWinsApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game score: ");
        String input = scanner.nextLine().trim();

        String[] sections = input.split(Pattern.quote("|"));
        String teamsText = sections[0];
        String scoresText = sections[1];

        String[] teams = teamsText.split(":");
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        String[] scores = scoresText.split(":");
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("Winner: Tie!");

        }
    }

    }
