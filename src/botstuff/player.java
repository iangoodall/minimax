/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botstuff;

/**
 *
 * @author ian
 */
public class player {

    int playerNumber;

    // initialise and set the player number
    public player(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    int move(board currentBoard) {
        int[][] boardState = currentBoard.returnBoard();
        GameTree newGameTree = new GameTree(boardState, 1);
        return 0;
    }

}
