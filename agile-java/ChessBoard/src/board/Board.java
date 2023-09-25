/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board;

import piece.Piece;
import java.util.ArrayList;

/**
 * Represents the board in a game of chess
 * @author emaph
 */
public class Board {

    private ArrayList<Piece> rank2 = new ArrayList<Piece>();
    private ArrayList<Piece> rank7 = new ArrayList<Piece>();

    public void initialize() {
        // Add 8 white Pawns to rank 2
        for (int i = 0; i < 8; i++) {
            addPieceRank2(new Piece());
        }

        // add 8 black Pawns to rank 7
        for (int i = 0; i < 8; i++) {
            addPieceRank7(new Piece(Piece.BLACK, 'P'));
        }
    }

    /**
     * Return number of pieces on the Board.
     * @return
     */
    int getNumberOfPieces() {
        return rank2.size() + rank7.size();
    }

    /**
     * Add a Pawn to the Board
     * @param pawn
     */
    private final void addPieceRank2(Piece pawn) {
        rank2.add(pawn);
    }

    private final void addPieceRank7(Piece pawn) {
        rank7.add(pawn);
    }

    /**
     * Return the Piece at the given index
     * @param i
     * @return
     */
    public Piece getPieceRank2(int idx) {
        return rank2.get(idx);
    }

    public Piece getPieceRank7(int idx) {
        return rank7.get(idx);
    }

    public String getRank2() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < rank2.size(); i++) {
            Piece pawn = rank2.get(i);
            builder.append(pawn.getRepresentation());
        }
        return builder.toString();
    }

    public String getRank7() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < rank7.size(); i++) {
            Piece pawn = rank7.get(i);
            builder.append(pawn.getRepresentation());
        }
        return builder.toString();
    }

    public String getEmptyRank() {
        return "........";
    }

    public String getBoadRepresentation() {
        StringBuilder builder = new StringBuilder();
        builder.append(getEmptyRank());
        builder.append('\n');
        builder.append(getRank7());
        builder.append('\n');
        builder.append(getEmptyRank());
        builder.append('\n');
        builder.append(getEmptyRank());
        builder.append('\n');
        builder.append(getEmptyRank());
        builder.append('\n');
        builder.append(getEmptyRank());
        builder.append('\n');
        builder.append(getRank2());
        builder.append('\n');
        builder.append(getEmptyRank());
        builder.append('\n');

        return builder.toString();
    }
}
