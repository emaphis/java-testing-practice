package piece;

/**
 * Represents a Pawn Piece on a Board of chess.
 * @author emaph
 */
public class Pawn {
    private String color;
    static public final String WHITE = "white";
    static public final String BLACK = "black";
    
    /**
     * Create a Pawn of a given color
     * @param color 
     */
    public Pawn(String color) {
        this.color = color;
    }

    /**
     * Create a white Pawn
     */
    public Pawn() {
        this.color = WHITE;
    }

    /**
     * Get Pawn's color
     * @return 
     */
    String getColor() {
        return color;
    }
    
}
