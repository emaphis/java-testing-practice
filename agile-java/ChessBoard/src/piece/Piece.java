package piece;



/**
 * Represents a Pawn Piece on a Board of chess.
 * @author emaph
 */
public class Piece {
    private final Color color;
    private final Type type;

    public enum Color { WHITE, BLACK, NONE };

    public enum Type { PAWN, KNIGHT, BISHOP, ROOK, QUEEN, KING, NO_PIECE };

    static public final String PAWN_STR = "Pawn";
    static public final String KNIGHT_STR = "Knight";
    static public final String BISHOP_STR = "Bishop";
    static public final String ROOK_STR = "Rook";
    static public final String QUEEN_STE = "Queen";
    static public final String KING_STR = "King";
    static public final String EMPTY_STR = "Empty";

    static public char PAWN_REPRESENTATION = 'p';
    static public char ROOK_REPRESENTATION = 'r';
    static public char KNIGHT_REPRESENTATION = 'n';
    static public char BISHOP_REPRESENTATION = 'b';
    static public char QUEEN_REPRESENTATION = 'q';
    static public char KING_REPRESENTATION = 'k';
    static public char EMPTY_REPRESENTATION = '.';

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

    public static Piece noPiece() {
        return new Piece(Color.NONE, Type.NO_PIECE);
    }

    public final String getName() {
        if (type == Type.PAWN) return PAWN_STR;
        if (type == Type.KNIGHT) return KNIGHT_STR;
        if (type == Type.BISHOP) return BISHOP_STR;
        if (type == Type.ROOK)  return ROOK_STR;
        if (type == Type.QUEEN)  return QUEEN_STE;
        if (type == Type.KING) return KING_STR;
        if (type == Type.NO_PIECE) return EMPTY_STR;
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
        if (type.equals(Type.NO_PIECE))
            return EMPTY_REPRESENTATION;

        char representation = ' ';

        if (type.equals(Type.PAWN))
            representation = PAWN_REPRESENTATION;
        else if (type.equals(Type.KNIGHT))
            representation = KNIGHT_REPRESENTATION;
        else if (type.equals(Type.BISHOP))
            representation = BISHOP_REPRESENTATION;
        else if (type.equals(Type.ROOK))
            representation = ROOK_REPRESENTATION;
        else if (type.equals(Type.QUEEN))
            representation = QUEEN_REPRESENTATION;
        else if (type.equals(Type.KING))
            representation = KING_REPRESENTATION;

        if (color == Color.BLACK)
            representation = Character.toUpperCase(representation);

        return representation;
    }

    public boolean isWhite() {
        return color == Color.WHITE;
    }

    public boolean isBlack() {
        return color == Color.BLACK;
    }

    public boolean isNone() {
        return color == Color.NONE;
    }

    public Type getType() {
        return type;
    }

    public static boolean isRepresentationBlack(char rep) {
        return Character.isUpperCase(rep);
    }

    public static boolean isRepresentationWhite(char rep) {
        return Character.isLowerCase(rep);
    }
}
