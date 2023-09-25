package piece;

import java.lang.reflect.Array;
import org.omg.CORBA.CharSeqHelper;

/**
 * Represents a Pawn Piece on a Board of chess.
 * @author emaph
 */
public class Piece {
    private String color;
    private char representation;
    private String name;

    static public final String WHITE = "white";
    static public final String BLACK = "black";

    static public final String PAWN = "Pawn";
    static public final String KNIGHT = "Knight";
    static public final String BISHOP = "Bishop";
    static public final String ROOK = "Rook";
    static public final String QUEEN = "Queen";
    static public final String KING = "King";

    /**
     * Create a Pawn of a given color
     * @param color
     * @param  representation char representation of he board.
     */
    private Piece(String color, char representation) {
        this.color = color;
        this.representation = representation;
    }

    public static Piece createPiece(String color, String name) {
        char rep = 'a';
        if (name.equals(KNIGHT))
            rep = 'N';
        else
            rep = name.charAt(0);

        if (color.equals(WHITE))
            rep = Character.toLowerCase(rep);

        return new Piece(color, rep);
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
