package lesson_5_arrays_multi_arrays.tictactoe;

import java.util.Scanner;

public class GameTicTacToe {
    public static void main(String[] args) {
        // Start Game
        startGame();
    }

    public static void startGame(){
        getInitialMSG();

        while(true){
            if ((input().nextLine()).equalsIgnoreCase("y")){
                char[][] table = initializeTable();
                System.out.println("********************************************");
                System.out.println("UPDATED TABLE:");
                readTable(table);
            } else {
                System.out.println("You choose not to move on with the game. GOODBYE!");
            }
            return;
        }
    }

    public static void getInitialMSG(){
        System.out.println("********************************************");
        System.out.println("Welcome to Tic-Tac-Toe game.");
        System.out.println("You need to play against AI.");
        System.out.println("Would you like to play a GAME?!");
        System.out.println("********************************************");
    }

    public static char[][] initializeTable(){
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'},
        };
    }

    public static void readTable(char[][] table){
        for(char[] outer : table){
            for (char inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }

    public static Scanner input (){
        return new Scanner(System.in);
    }
}
