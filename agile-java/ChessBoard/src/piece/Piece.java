package piece;


/**
 * Represents a Pawn Piece on a Board of chess.
 * @author emaph
 */
public class Piece {
    private Color color;
    private String name;

    public enum Color { WHITE, BLACK, BLANK };

    static public final String PAWN = "Pawn";
    static public final String KNIGHT = "Knight";
    static public final String BISHOP = "Bishop";
    static public final String ROOK = "Rook";
    static public final String QUEEN = "Queen";
    static public final String KING = "King";
    static public final String EMPTY = "Empty";

    /**
     * Create a Pawn of a given color
     * @param color
     * @param  representation char representation of he board.
     */
    private Piece(Color color, String name) {
        this.color = color;
        this.name = name;
    }

    public static Piece createPiece(Color color, String name) {
        return new Piece(color, name);
    }

    /**
     * Get Pawn's color
     * @return
     */
    public Color getColor() {
        return color;
    }

    public char getRepresentation() {
        char representation = 'a';
        if (name.equals(KNIGHT))
            representation = 'N';
        else if (name.equals(EMPTY))
            representation = '.';
        else
            representation = name.charAt(0);

        if (color.equals(Color.WHITE))
            representation = Character.toLowerCase(representation);

        return representation;
    }
}
