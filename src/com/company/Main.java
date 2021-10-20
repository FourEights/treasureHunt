package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String [] [] board = new String[10][8];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

        int maxXCoord = 8;
        int maxYCoord = 10;

        Random treasureAmountRandomiser = new Random(100);
        Random treasureLocationXRandomizer = new Random(8);
        Random treasureLocationYRandomizer = new Random(10);
        Scanner treasureGuessXInput = new Scanner(System.in);
        Scanner treasureGuessYInput = new Scanner(System.in);

        int treasureLocationX = treasureLocationXRandomizer.nextInt();
        int treasureLocationY = treasureLocationYRandomizer.nextInt();
        int treasureAmount = treasureAmountRandomiser.nextInt();

        System.out.println("Where do you think the treasure is?\n");
        System.out.print("X: ");
        int treasureGuessX = treasureGuessXInput.nextInt();
        System.out.print("\n");
        System.out.print("Y: ");
        int treasureGuessY = treasureGuessYInput.nextInt();


        if((treasureGuessX == treasureLocationX+1) && (treasureGuessY == treasureLocationY+1)){
            System.out.println("You found " + treasureAmount+1 + " gold coins!");
        }
        else{
            System.out.println("You missed the gold! Game over!");
        }
    }
}
