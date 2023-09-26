package piece;


/**
 * Represents a Pawn Piece on a Board of chess.
 * @author emaph
 */
public class Piece {
    private String color;
    private String name;

    static public final String WHITE = "white";
    static public final String BLACK = "black";

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
    private Piece(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public static Piece createPiece(String color, String name) {
        return new Piece(color, name);
    }

    /**
     * Get Pawn's color
     * @return
     */
    public String getColor() {
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

        if (color.equals(WHITE))
            representation = Character.toLowerCase(representation);

        return representation;
    }
}
