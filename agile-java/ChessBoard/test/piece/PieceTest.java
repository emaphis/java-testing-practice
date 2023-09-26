package piece;

import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class PieceTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
    }

    public void testCreate() {
        Piece whitePawn = Piece.createPiece(Piece.WHITE, Piece.PAWN);
        assertEquals(Piece.WHITE, whitePawn.getColor());

        Piece blackPawn = Piece.createPiece(Piece.BLACK, Piece.PAWN);
        assertEquals(Piece.BLACK, blackPawn.getColor());
    }

    public void testPawn() {
        Piece pawn = Piece.createPiece(Piece.WHITE, Piece.PAWN);
        assertEquals(Piece.WHITE, pawn.getColor());
    }

    public void testPawnPrintRepresentation() {
        Piece whitePawn = Piece.createPiece(Piece.WHITE, Piece.PAWN);
        Piece blackPawn = Piece.createPiece(Piece.BLACK, Piece.PAWN);
        assertEquals('P', blackPawn.getRepresentation());
        assertEquals('p', whitePawn.getRepresentation());
    }

}
