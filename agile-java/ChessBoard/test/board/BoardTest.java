package board;

import piece.Piece;
import junit.framework.TestCase;
import util.StringUtil;

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
        assertEquals("pppppppp", board.getRankReresentation(board.rank2));
        assertEquals("PPPPPPPP", board.getRankReresentation(board.rank7));
    }

    public void testIntitalize() {
        assertEquals(0, board.getNumberOfPieces());
        board.initialize();
        assertEquals(16, board.getNumberOfBoardPieces(Piece.Color.WHITE));
        assertEquals(16, board.getNumberOfBoardPieces(Piece.Color.BLACK));
        assertEquals(32, board.getNumberOfPieces());
    }

    public void testBoardRepresentaion() {
        board.initialize();
        String given = board.getBoadRepresentation();
        System.out.println(given);

        String blankLine = StringUtil.appendNewLine("........");
        String expected = "";
        expected += StringUtil.appendNewLine("RNBQKBNR")
                + StringUtil.appendNewLine("PPPPPPPP")
                + blankLine + blankLine + blankLine + blankLine
                + StringUtil.appendNewLine("pppppppp")
                + StringUtil.appendNewLine("rnbqkbnr");

        assertEquals(expected, given);
    }
}
