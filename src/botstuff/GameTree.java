package botstuff;

import java.util.List;
import java.util.ArrayList;

/**
 *
 *
 * The game tree class which keeps track of the game tree for the minimax
 * algorithm
 */
public class GameTree {

    //root node of the game tree
    BoardNode root;
    int depth;

    // constructs the game tree
    public GameTree(int[][] currentBoard, int searchDepth) {
        // creates the root node
        depth = searchDepth; // sets game tree depth
        root = new BoardNode(currentBoard);
        GenerateChildren(root, 1);
    }

    // generates game tree for moves ahead
    static void GenerateChildren(BoardNode parent, int player) {
        // iterate through the seven possible moves to create new children
        for (int x = 0; x < 7; x++) {
            // create a new child based on the parent field node
            BoardNode newChild = new BoardNode(parent, x, player);
            parent.children.add(newChild);
        }
    }
}

class BoardNode {

    //variables for BoardNode class
    protected int[][] field; // stores field data
    protected List<BoardNode> children; // stores child BoardNodes
    int score; // stores score for either this node or the best score of it's children
    // constructor for the root

    public BoardNode(int[][] newField) {
        field = createField(newField);
        children = new ArrayList<BoardNode>();
    }

    // constructor for a child node
    public BoardNode(BoardNode parent, int tilePlace, int player) {
        field = createField(parent.field);
        children = new ArrayList<BoardNode>();
        /**
         * Need error handling for placeToken method. If a token cannot be
         * placed due to the column being full, needs to make sure this doesn't
         * break it
         */
        placeToken(tilePlace, player);
    }

    // places a token in the node
    private void placeToken(int tilePlace, int player) {
        boolean placed = false;
        while (placed == false) {
            int x = 5;
            if (field[x][tilePlace] == 0) {
                field[x][tilePlace] = player;
                placed = true;
            } else {
                x--;
            }
        }
    }

    void printBoard() {
        System.out.print("\nCurrent Node Field\n");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
    }

    int[][] createField(int[][] baseField) {
        int[][] newField = new int[6][7];
        for (int i = 0; i < 6; i++) {
            System.arraycopy(baseField[i], 0, newField[i], 0, 7);
        }
        return newField;
    }
}
