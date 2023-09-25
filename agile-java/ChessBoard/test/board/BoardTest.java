package board;

import piece.Pawn;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class BoardTest extends TestCase {

    private Board board;

    public BoardTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        board = new Board();
    }

    public void testCreate() {
        board.initialize();
        assertEquals("pppppppp", board.getRank2());
        assertEquals("PPPPPPPP", board.getRank7());
    }

    public void testIntitalize() {
        assertEquals(0, board.getNumberOfPieces());
        board.initialize();
        assertEquals(16, board.getNumberOfPieces());
    }

    public void testPawnsExist() {
        Board board = new Board();
        board.initialize();

        // assert 2nd rank
        for (int i = 0; i < 8; i++) {
            assertEquals('p', board.getPieceRank2(i).getRepresentation());
        }

        // assert 7th rank
        for (int i = 0; i < 8; i++) {
            assertEquals('P', board.getPieceRank7(i).getRepresentation());
        }
    }

    public void testBoardRepresentaion() {
        board.initialize();
        String given = board.getBoadRepresentation();
        String expected
                = "........\n"
                + "PPPPPPPP\n"
                + "........\n"
                + "........\n"
                + "........\n"
                + "........\n"
                + "pppppppp\n"
                + "........\n";
        assertEquals(expected, given);
        System.out.println(given);
    }
}
