package piece;

/**
 * Represents a Pawn Piece on a Board of chess.
 * @author emaph
 */
public class Pawn {
    private String color;
    private char representation;
    static public final String WHITE = "white";
    static public final String BLACK = "black";

    /**
     * Create a Pawn of a given color
     * @param color
     * @param  representation char representation of he board.
     */
    public Pawn(String color, char representation) {
        this.color = color;
        this.representation = representation;
    }

    /**
     * Create a white Pawn
     */
    public Pawn() {
        this.color = WHITE;
        this.representation = 'p';
    }

    /**
     * Get Pawn's color
     * @return
     */
    public String getColor() {
        return color;
    }

    public char getRepresentation() {
        return representation;
    }
}
