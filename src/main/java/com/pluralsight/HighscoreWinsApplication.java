package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;
public class HighscoreWinsApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game score: ");
        String input = scanner.nextLine().trim();

        String[] sections = input.split(Pattern.quote("|"));
        String teams = sections[0];
        String scores = sections[1];

    }
}
