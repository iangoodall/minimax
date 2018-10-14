/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botstuff;

import java.util.*;

/**
 *
 * @author ian
 */
public class board {

    private int width;
    private int height;
    private int board[][];

    public board(int width, int height, int type) {
        // initalise all the variables
        this.width = width;
        this.height = height;
        this.board = new int[width][height];

        //fill board with blanks
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                board[i][j] = 0;
            }
        }

    }

    // print contents of the board in a nice format
    void printBoard() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    void placeTile(int x, int player) {
        // if bottom tile is free, fill it
        int y = 5;
        int placed = 0;

        while (y >= 0) {
            y--;
        }

        if (placed == 0) {
            System.out.println("Could not place tile as column full");
        } else {
            System.out.println("New tile placed");
        }
        this.printBoard();

        // check to see if the result leads to a winner
        boolean win = winTest(player);
        if (win == true) {
            System.out.println(player);
            System.out.println("wins!");
        }
    }

    // tests to see if the next placed tile in that column will result in 4
    boolean winTest(int player) {
        return false;
    }

    int[][] returnBoard() {
        return board;
    }

}
