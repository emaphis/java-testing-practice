/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board;

import piece.Pawn;
import java.util.ArrayList;

/**
 * Represents the board in a game of chess
 * @author emaph
 */
public class Board {
    
    private ArrayList<Pawn> pieces = new ArrayList<Pawn>();

    /**
     * Return number of pieces on the Board.
     * @return 
     */
    int getNumberOfPieces() {
        return pieces.size();
    }

    /**
     * Add a Pawn to the Board
     * @param pawn
     */
    void addPiece(Pawn pawn) {
        pieces.add(pawn);
    }

    /**
     * Return the Piece at the given index
     * @param i
     * @return 
     */
    public Pawn getPiece(int idx) {
        return pieces.get(idx);
    }
    
}
