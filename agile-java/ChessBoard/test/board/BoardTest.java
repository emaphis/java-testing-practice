
package board;

import piece.Pawn;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class BoardTest extends TestCase {
    
    Board board;
    
    public BoardTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        board = new Board();
    }

    public void testCreate() {
        int numPieces = board.getNumberOfPieces();
        assertEquals(0, numPieces);
    }

    public void testAddPieces() {
        assertEquals(0, board.getNumberOfPieces());
        
        Pawn pawn1 = new Pawn();
        board.addPiece(pawn1);
        assertEquals(1, board.getNumberOfPieces());
        assertEquals(pawn1, board.getPiece(0));
        
        Pawn pawn2 = new Pawn(Pawn.BLACK);
        board.addPiece(pawn2);
        assertEquals(2, board.getNumberOfPieces());
        assertEquals(pawn1, board.getPiece(0));
        assertEquals(pawn2, board.getPiece(1));
    }
    
}
