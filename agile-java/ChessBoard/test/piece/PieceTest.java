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
        Piece whitePawn = Piece.createWhitePawn();
        assertEquals(Piece.Color.WHITE, whitePawn.getColor());

        Piece blackPawn = Piece.createBlackPawn();
        assertEquals(Piece.Color.BLACK, blackPawn.getColor());
    }

    public void testPawn() {
        Piece pawn = Piece.createWhitePawn();
        assertEquals(Piece.Color.WHITE, pawn.getColor());
    }

    public void testPawnPrintRepresentation() {
        Piece whitePawn = Piece.createWhitePawn();
        Piece blackPawn = Piece.createBlackPawn();
        assertEquals('P', blackPawn.getRepresentation());
        assertEquals('p', whitePawn.getRepresentation());
    }

}
