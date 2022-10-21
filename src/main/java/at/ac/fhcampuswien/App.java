package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }

    public static void oneMonthCalendar(int tageImMonat, int ersterTag) {

        int tag = 1;

        for (int i = 1; i < ersterTag; i++) {
            System.out.print(" ");
            tag++;
            if (tag == 8) {
                tag = 1;
                System.out.println();
            }
        }
        for (int j = 0; j <= tageImMonat; j++) {
            if (tag == 8) {
                tag = 1;
                System.out.println();
            }
            if (j < 10) {
                System.out.print(" ");
            }
            System.out.print(j + " ");
            tag++;
        }
        System.out.print("\n");
    }

    public static long[] lcg(long seed) {
        long[] randomNumbers = new long[10];
        double m = Math.pow(2, 31);
        int a = 1103515245;
        int c = 12345;

        randomNumbers[0] = (long) ((a * seed + c) % m);
        for (int i = 1; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
            for (i = 0; i < 10; i++) {
                if (i == 0) {
                    randomNumbers[i] = (long) ((a * seed + c) % m);
                } else {
                    randomNumbers[i] = (long) ((a * randomNumbers[i - 1] + c) % m);
                }
            }
        }
        return randomNumbers;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner input = new Scanner(System.in);
        int number;
        int versuche = 10;
        for(int i = 0; i <versuche; i++){
            System.out.print("Guess number" + i + ": ");
            i++;
            number = input.nextInt();
            if (i + 1 == versuche){
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
            if (number > numberToGuess){
                System.out.println("The number AI picked is lower than your guess");
            }else if (number < numberToGuess){
                System.out.println("The number AI picked is lower than your guess");
            }
            else {
                System.out.println("You won wisenheimer!");
                break;
            }

        }
    }

    public static int randomNumberBetweenOneAndHundred(){
        Random ranNumb = new Random();
        return ranNumb.nextInt(100)+1;
    }
}






