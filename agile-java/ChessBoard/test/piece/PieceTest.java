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
        Piece whitePawn = Piece.createPiece(Piece.Color.WHITE, Piece.Type.PAWN);
        assertEquals(Piece.Color.WHITE, whitePawn.getColor());

        Piece blackPawn = Piece.createPiece(Piece.Color.BLACK, Piece.Type.PAWN);
        assertEquals(Piece.Color.BLACK, blackPawn.getColor());
    }

    public void testPawn() {
        Piece pawn = Piece.createPiece(Piece.Color.WHITE, Piece.Type.PAWN);
        assertEquals(Piece.Color.WHITE, pawn.getColor());
    }

    public void testPawnPrintRepresentation() {
        Piece whitePawn = Piece.createPiece(Piece.Color.WHITE, Piece.Type.PAWN);
        Piece blackPawn = Piece.createPiece(Piece.Color.BLACK, Piece.Type.PAWN);
        assertEquals('P', blackPawn.getRepresentation());
        assertEquals('p', whitePawn.getRepresentation());
    }

}
