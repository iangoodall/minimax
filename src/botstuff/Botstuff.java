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
public class Botstuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        board blankBoard = new board(6, 7, 0);
        blankBoard.printBoard();
        GameTree newGameTree = new GameTree(blankBoard.returnBoard(), 1);
        newGameTree.root.printBoard();
        // print the children of the root node
        for (int x = 0; x < 7; x++) {
            newGameTree.root.children.get(x).printBoard();
        }

    }

}
