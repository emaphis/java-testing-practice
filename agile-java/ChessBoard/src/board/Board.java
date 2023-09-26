package board;

import piece.Piece;
import java.util.ArrayList;
import util.StringUtil;

/**
 * Represents the board in a game of chess
 * @author emaph
 */
public class Board {

    public ArrayList<Piece> rank1 = new ArrayList<Piece>();
    public ArrayList<Piece> rank2 = new ArrayList<Piece>();
    public ArrayList<Piece> rank3 = new ArrayList<Piece>();
    public ArrayList<Piece> rank4 = new ArrayList<Piece>();
    public ArrayList<Piece> rank5 = new ArrayList<Piece>();
    public ArrayList<Piece> rank6 = new ArrayList<Piece>();
    public ArrayList<Piece> rank7 = new ArrayList<Piece>();
    public ArrayList<Piece> rank8 = new ArrayList<Piece>();

    public void initialize() {
        addPieceRank(rank1, Piece.WHITE);
        addPawnRank(rank2, Piece.WHITE);

        addBlankRank(rank3);
        addBlankRank(rank4);
        addBlankRank(rank5);
        addBlankRank(rank6);

        addPawnRank(rank7, Piece.BLACK);
        addPieceRank(rank8, Piece.BLACK);
    }

    /**
     * Return number of pieces on the Board.
     * @return
     */
    public int getNumberOfPieces() {
        return getNumberOfBoardPieces(Piece.WHITE) + getNumberOfBoardPieces(Piece.BLACK);
    }

    public int getNumberOfBoardPieces(String color) {
        int count = 0;
        count += getNumberOfRankPieces(rank1, color);
        count += getNumberOfRankPieces(rank2, color);
        count += getNumberOfRankPieces(rank3, color);
        count += getNumberOfRankPieces(rank4, color);
        count += getNumberOfRankPieces(rank5, color);
        count += getNumberOfRankPieces(rank6, color);
        count += getNumberOfRankPieces(rank7, color);
        count += getNumberOfRankPieces(rank8, color);

        return count;
    }

    private int getNumberOfRankPieces(ArrayList<Piece> rank, String color) {
        int count = 0;
        for (int i = 0; i < rank.size(); i++) {
            if (rank.get(i).getColor().equals(color))
                count++;
        }
        return count;
    }

    private void addBlankRank(ArrayList<Piece> rank) {
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createPiece(Piece.EMPTY, Piece.EMPTY));
        }
    }

    private void addPawnRank(ArrayList<Piece> rank, String color) {
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createPiece(color, Piece.PAWN));
        }
    }

    private void addPieceRank(ArrayList<Piece> rank, String color) {
        rank.add(Piece.createPiece(color, Piece.ROOK));
        rank.add(Piece.createPiece(color, Piece.KNIGHT));
        rank.add(Piece.createPiece(color, Piece.BISHOP));
        rank.add(Piece.createPiece(color, Piece.QUEEN));
        rank.add(Piece.createPiece(color, Piece.KING));
        rank.add(Piece.createPiece(color, Piece.BISHOP));
        rank.add(Piece.createPiece(color, Piece.KNIGHT));
        rank.add(Piece.createPiece(color, Piece.ROOK));
    }
    /**
     * Return the Piece at the given index
     * @param rank rank holding pieces.
     * @param idx index in the rank
     * @return
     */
    public Piece getPieceRank(ArrayList<Piece> rank, int idx) {
        return rank.get(idx);
    }

    public String getRankReresentation(ArrayList<Piece> rank) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < rank.size(); i++) {
            Piece p = rank.get(i);
            builder.append(p.getRepresentation());
        }
        return builder.toString();
    }

    public String getBoadRepresentation() {
        //StringBuilder str = new StringBuilder();
        String str = "";
        str += StringUtil.appendNewLine(getRankReresentation(rank8));
        str += StringUtil.appendNewLine(getRankReresentation(rank7));
        str += StringUtil.appendNewLine(getRankReresentation(rank6));
        str += StringUtil.appendNewLine(getRankReresentation(rank5));
        str += StringUtil.appendNewLine(getRankReresentation(rank4));
        str += StringUtil.appendNewLine(getRankReresentation(rank3));
        str += StringUtil.appendNewLine(getRankReresentation(rank2));
        str += StringUtil.appendNewLine(getRankReresentation(rank1));

        return str;
    }
}
