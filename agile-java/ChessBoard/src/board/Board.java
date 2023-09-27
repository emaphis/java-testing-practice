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
        addWhitePieceRank(rank1);
        addWhitePawnRank(rank2);

        addBlankRank(rank3);
        addBlankRank(rank4);
        addBlankRank(rank5);
        addBlankRank(rank6);

        addBlackPawnRank(rank7);
        addBlackPieceRank(rank8);
    }

    /**
     * Return number of pieces on the Board.
     * @return
     */
    public int getNumberOfPieces() {
        return getNumberOfBoardPieces(Piece.Color.WHITE) + getNumberOfBoardPieces(Piece.Color.BLACK);
    }

    public int getNumberOfBoardPieces(Piece.Color color) {
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

    private int getNumberOfRankPieces(ArrayList<Piece> rank, Piece.Color color) {
        int count = 0;
        for (int i = 0; i < rank.size(); i++) {
            if (rank.get(i).getColor().equals(color))
                count++;
        }
        return count;
    }

    private void addBlankRank(ArrayList<Piece> rank) {
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.noPiece());
        }
    }

    private void addWhitePawnRank(ArrayList<Piece> rank) {
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createWhitePawn());
        }
    }

    private void addBlackPawnRank(ArrayList<Piece> rank) {
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createBlackPawn());
        }
    }

    private void addWhitePieceRank(ArrayList<Piece> rank) {
        rank.add(Piece.createWhiteRook());
        rank.add(Piece.createWhiteKnight());
        rank.add(Piece.createWhiteBishop());
        rank.add(Piece.createWhiteQueen());
        rank.add(Piece.createWhiteKing());
        rank.add(Piece.createWhiteBishop());
        rank.add(Piece.createWhiteKnight());
        rank.add(Piece.createWhiteRook());
    }


    private void addBlackPieceRank(ArrayList<Piece> rank) {
        rank.add(Piece.createBlackRook());
        rank.add(Piece.createBlackKnight());
        rank.add(Piece.createBlackBishop());
        rank.add(Piece.createBlackQueen());
        rank.add(Piece.createBlackKing());
        rank.add(Piece.createBlackBishop());
        rank.add(Piece.createBlackKnight());
        rank.add(Piece.createBlackRook());
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

    public void printBoard() {
        String rep = getBoadRepresentation();
        System.out.println(rep);
        System.out.println();
    }

    public Piece getPieceFromRepresentation(char rep) {
        Piece piece = Piece.noPiece();
        if (rep == Piece.EMPTY_REPRESENTATION)
            return piece;

        if (Piece.isRepresentationBlack(rep)) {  // Black pieces
            rep = Character.toLowerCase(rep);
            if (rep == Piece.PAWN_REPRESENTATION)
                piece = Piece.createBlackPawn();
            if (rep == Piece.BISHOP_REPRESENTATION)
                piece = Piece.createBlackBishop();
            if (rep == Piece.KNIGHT_REPRESENTATION)
                piece = Piece.createBlackKnight();
            if (rep == Piece.ROOK_REPRESENTATION)
                piece = Piece.createBlackRook();
            if (rep == Piece.QUEEN_REPRESENTATION)
                piece = Piece.createBlackQueen();
            if (rep == Piece.KING_REPRESENTATION)
                piece = Piece.createBlackKing();
        } else {
            if (rep == Piece.PAWN_REPRESENTATION)
                piece = Piece.createWhitePawn();
            if (rep == Piece.BISHOP_REPRESENTATION)
                piece = Piece.createWhiteBishop();
            if (rep == Piece.KNIGHT_REPRESENTATION)
                piece = Piece.createWhiteKnight();
            if (rep == Piece.ROOK_REPRESENTATION)
                piece = Piece.createWhiteRook();
            if (rep == Piece.QUEEN_REPRESENTATION)
                piece = Piece.createWhiteQueen();
            if (rep == Piece.KING_REPRESENTATION)
                piece = Piece.createWhiteKing();
        }
        System.out.println();  // kill e
        return piece;
    }

    public void readBoard(String brd) {

        for (int i = 0; i < 64; i++) {
            char rep = brd.charAt(i);

            if (i < 8) {
                rank8.add(getPieceFromRepresentation(rep));
            } else if (i >= 8 && i < 16) {
                rank7.add(getPieceFromRepresentation(rep));
            } else if (i >= 16 && i < 24) {
                rank6.add(getPieceFromRepresentation(rep));
            } else if (i >= 24 && i < 32) {
                rank5.add(getPieceFromRepresentation(rep));
            } else if (i >= 32 && i < 40) {
                rank4.add(getPieceFromRepresentation(rep));
            } else if (i >= 40 && i < 48) {
                rank3.add(getPieceFromRepresentation(rep));
            } else if (i >= 48 && i < 56) {
                rank2.add(getPieceFromRepresentation(rep));
            } else if (i >= 56 && i < 64) {
                rank1.add(getPieceFromRepresentation(rep));
            }
        }
    }
}
