package U2T7_Lab_1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Asks users to enter two words
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        int len1 = str1.length();
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        int len2 = str2.length();
        //States which of the strings is longer
        if (len1 > len2) {
            System.out.println(str1 + " is longer");
        } else if (len2 > len1) {
            System.out.println(str2 + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }
        //Splits each word into two halves
        String firstHalf1 = str1.substring(0, len1 / 2);
        String secHalf1 = str1.substring(len1 / 2);
        String firstHalf2 = str2.substring(0, len2 / 2);
        String secHalf2 = str2.substring(len2 / 2);
        System.out.println("First half: " + firstHalf1);
        System.out.println("Second half: " + secHalf1);
        System.out.println("First half: " + firstHalf2);
        System.out.println("Second half: " + secHalf2);
        //States if and where the second string is contained in the first string
        if (str1.indexOf(str2) == -1) {
            System.out.println(str2 + " is NOT found in " + str1);
        } else {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        }
    }
}
