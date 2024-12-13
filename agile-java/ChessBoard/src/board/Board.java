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
        addPieceRank(rank1, Piece.Color.WHITE);
        addPawnRank(rank2, Piece.Color.WHITE);

        addBlankRank(rank3);
        addBlankRank(rank4);
        addBlankRank(rank5);
        addBlankRank(rank6);

        addPawnRank(rank7, Piece.Color.BLACK);
        addPieceRank(rank8, Piece.Color.BLACK);
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

    private void addPawnRank(ArrayList<Piece> rank, Piece.Color color) {
        for (int i = 0; i < 8; i++) {
            rank.add(Piece.createPawn(color));
        }
    }

    private void addPieceRank(ArrayList<Piece> rank, Piece.Color color) {
        rank.add(Piece.createRook(color));
        rank.add(Piece.createKnight(color));
        rank.add(Piece.createBishop(color));
        rank.add(Piece.createQueen(color));
        rank.add(Piece.createKing(color));
        rank.add(Piece.createBishop(color));
        rank.add(Piece.createKnight(color));
        rank.add(Piece.createRook(color));
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

        Piece.Color color;
        if (Piece.isRepresentationBlack(rep)) {  // Black pieces
            rep = Character.toLowerCase(rep);
            color = Piece.Color.BLACK;
        } else {
            color = Piece.Color.WHITE;
        }

        if (rep == Piece.PAWN_REPRESENTATION)
            piece = Piece.createPawn(color);
        if (rep == Piece.BISHOP_REPRESENTATION)
            piece = Piece.createBishop(color);
        if (rep == Piece.KNIGHT_REPRESENTATION)
            piece = Piece.createKnight(color);
        if (rep == Piece.ROOK_REPRESENTATION)
            piece = Piece.createRook(color);
        if (rep == Piece.QUEEN_REPRESENTATION)
            piece = Piece.createQueen(color);
        if (rep == Piece.KING_REPRESENTATION)
            piece = Piece.createKing(color);

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

    /**
     * Return count of particulate piece on the board.
     * @param color
     * @param representation
     * @return
     */
    public int countPiece(Piece.Color color, char representation) {
        int count = 0;
        count += countPieceRank(rank8, color, representation);
        count += countPieceRank(rank7, color, representation);
        count += countPieceRank(rank6, color, representation);
        count += countPieceRank(rank5, color, representation);
        count += countPieceRank(rank4, color, representation);
        count += countPieceRank(rank3, color, representation);
        count += countPieceRank(rank2, color, representation);
        count += countPieceRank(rank1, color, representation);

        return count;
    }

    private int countPieceRank(ArrayList<Piece> rank, Piece.Color color, final char representation) {
        int count = 0;
        for (Piece piece : rank) {
            Piece.Color pieceColor = piece.getColor();
            if (pieceColor == color) {
                char pieceRep = piece.getRepresentation();
                if (pieceColor == Piece.Color.BLACK)
                    pieceRep = Character.toLowerCase(pieceRep);

                if (pieceRep == representation)
                    count++;
            }
        }
        return count;
    }

    /**
     * Get Board Size.
     * @return
     */
     public int getSize() {
        int count = 0;
        count += rank8.size();
        count += rank7.size();
        count += rank6.size();
        count += rank5.size();
        count += rank4.size();
        count += rank3.size();
        count += rank2.size();
        count += rank1.size();
        return count;
    }

    int switchLabel(char label) {
        label = Character.toLowerCase(label);
        return label - 96;
    }

    // Doesn't need to be public
    int switchIndex(int index) {
        return index + 96;
    }

    public Piece retrievePiece(String location) {
        int row = location.charAt(0);
        int col = location.charAt(1);

        Piece piece = Piece.noPiece();

        if (row == 8) piece = getPieceRank(rank8, col);
        if (row == 7) piece = getPieceRank(rank7, col);
        if (row == 6) piece = getPieceRank(rank6, col);
        if (row == 5) piece = getPieceRank(rank5, col);
        if (row == 4) piece = getPieceRank(rank4, col);
        if (row == 3) piece = getPieceRank(rank3, col);
        if (row == 2) piece = getPieceRank(rank2, col);
        if (row == 1) piece = getPieceRank(rank1, col);

        return  piece;
    }
}
