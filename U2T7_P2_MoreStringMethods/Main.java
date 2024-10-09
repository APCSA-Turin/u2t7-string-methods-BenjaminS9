package U2T7_P2_MoreStringMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int wordCount = 1;
        int pointsEarned = 0;

        System.out.print("Enter your word: ");
        String prevWord = scan.nextLine();
        while (score < 50) {
            System.out.print("Enter your next word: ");
            String currentWord = scan.nextLine();

            if (currentWord.compareTo(prevWord) > 0) {
                pointsEarned += 2;
            } else if (currentWord.compareTo(prevWord) < 0) {
                pointsEarned -= 5;
            } else if (currentWord.equals(prevWord)) {
                pointsEarned -= 10;
            }

            String lastTwo = prevWord.substring(prevWord.length() - 2);
            String firstTwo = currentWord.substring(0, 2);
            if (lastTwo.equals(firstTwo)) {
                pointsEarned += 5;
            }

            String firstLetter = prevWord.substring(0, 1);
            if (currentWord.indexOf(firstLetter) != -1) {
                pointsEarned += 3;
            }

            //new code for same length words
            if (prevWord.length() == currentWord.length()) {
                pointsEarned += 2;
            }

            score += pointsEarned;
            System.out.println("You have accrued " + pointsEarned + " points");
            System.out.println("Your current score is " + score);
            wordCount++;
            prevWord = currentWord;
            pointsEarned = 0;
        }
        System.out.println("Congratulations! It took you " + wordCount + " words to win");
        System.err.println("Try again for a better score");
    }
}
