package piece;


/**
 * Represents a Pawn Piece on a Board of chess.
 * @author emaph
 */
public class Piece {
    private final Color color;
    private final Type type;

    public enum Color { WHITE, BLACK, BLANK };

    public enum Type { PAWN, KNIGHT, BISHOP, ROOK, QUEEN, KING, EMPTY };

    static public final String PAWN_STR = "Pawn";
    static public final String KNIGHT_STR = "Knight";
    static public final String BISHOP_STR = "Bishop";
    static public final String ROOK_STR = "Rook";
    static public final String QUEEN_STE = "Queen";
    static public final String KING_STR = "King";
    static public final String EMPTY_STR = "Empty";

    /**
     * Create a Pawn of a given color
     * @param color
     * @param  representation char representation of he board.
     */
    private Piece(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    public static Piece createWhitePawn() {
        return new Piece(Color.WHITE, Type.PAWN);
    }

    public static Piece createBlackPawn() {
        return new Piece(Color.BLACK, Type.PAWN);
    }

    public static Piece createWhiteKnight() {
        return new Piece(Color.WHITE, Type.KNIGHT);
    }

    public static Piece createBlackKnight() {
        return new Piece(Color.BLACK, Type.KNIGHT);
    }

    public static Piece createWhiteBishop() {
        return new Piece(Color.WHITE, Type.BISHOP);
    }

    public static Piece createBlackBishop() {
        return new Piece(Color.BLACK, Type.BISHOP);
    }

    public static Piece createWhiteRook() {
        return new Piece(Color.WHITE, Type.ROOK);
    }

    public static Piece createBlackRook() {
        return new Piece(Color.BLACK, Type.ROOK);
    }

    public static Piece createWhiteQueen() {
        return new Piece(Color.WHITE, Type.QUEEN);
    }

    public static Piece createBlackQueen() {
        return new Piece(Color.BLACK, Type.QUEEN);
    }

    public static Piece createWhiteKing() {
        return new Piece(Color.WHITE, Type.KING);
    }

    public static Piece createBlackKing() {
        return new Piece(Color.BLACK, Type.KING);
    }

    public static Piece createEmptySpace() {
        return new Piece(Color.BLANK, Type.EMPTY);
    }

    public final String getName() {
        if (type == Type.PAWN) return PAWN_STR;
        if (type == Type.KNIGHT) return KNIGHT_STR;
        if (type == Type.BISHOP) return BISHOP_STR;
        if (type == Type.ROOK)  return ROOK_STR;
        if (type == Type.QUEEN)  return QUEEN_STE;
        if (type == Type.KING) return KING_STR;
        if (type == Type.EMPTY) return EMPTY_STR;
        return "ERROR";
    }

    /**
     * Get Pawn's color
     * @return
     */
    public Color getColor() {
        return color;
    }

    public char getRepresentation() {
        char representation;
        if (type.equals(Type.KNIGHT))
            representation = 'N';
        else if (type.equals(Type.EMPTY))
            representation = '.';
        else
            representation = this.getName().charAt(0);

        if (color.equals(Color.WHITE))
            representation = Character.toLowerCase(representation);

        return representation;
    }
}
