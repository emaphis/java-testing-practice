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
        board.printBoard();

        String blankLine = StringUtil.appendNewLine("........");
        String expected = "";
        expected += StringUtil.appendNewLine("RNBQKBNR")
                + StringUtil.appendNewLine("PPPPPPPP")
                + blankLine + blankLine + blankLine + blankLine
                + StringUtil.appendNewLine("pppppppp")
                + StringUtil.appendNewLine("rnbqkbnr");

        assertEquals(expected, given);
    }

    public void testReadBoard() {
        String brd =
                ".KR....." +
                "P.PB...." +
                ".P..Q..." +
                "........" +
                ".....nq." +
                ".....p.." +
                "......p." +
                "....rk..";

        Board board1 = new Board();
        board1.readBoard(brd);
        //board1.printBoard();
    }

    public void testPieceCount() {
        String brd =
                ".KR....." +
                "P.PB...." +
                ".P..Q..." +
                "........" +
                ".....nq." +
                ".....p.." +
                "......p." +
                "....rk..";

        Board board1 = new Board();
        board1.readBoard(brd);

        assertEquals(2, board1.countPiece(Piece.Color.WHITE, Piece.PAWN_REPRESENTATION));
        assertEquals(3, board1.countPiece(Piece.Color.BLACK, Piece.PAWN_REPRESENTATION));
        assertEquals(0, board1.countPiece(Piece.Color.WHITE, Piece.BISHOP_REPRESENTATION));
        assertEquals(1, board1.countPiece(Piece.Color.BLACK, Piece.BISHOP_REPRESENTATION));
        assertEquals(1, board1.countPiece(Piece.Color.WHITE, Piece.KNIGHT_REPRESENTATION));
        assertEquals(0, board1.countPiece(Piece.Color.BLACK, Piece.KNIGHT_REPRESENTATION));
        assertEquals(1, board1.countPiece(Piece.Color.WHITE, Piece.ROOK_REPRESENTATION));
        assertEquals(1, board1.countPiece(Piece.Color.BLACK, Piece.ROOK_REPRESENTATION));
        assertEquals(1, board1.countPiece(Piece.Color.WHITE, Piece.KING_REPRESENTATION));
        assertEquals(1, board1.countPiece(Piece.Color.BLACK, Piece.KING_REPRESENTATION));
        assertEquals(1, board1.countPiece(Piece.Color.WHITE, Piece.QUEEN_REPRESENTATION));
        assertEquals(1, board1.countPiece(Piece.Color.BLACK, Piece.QUEEN_REPRESENTATION));

        //sboard1.printBoard();
        assertEquals(64, board1.getSize());
    }
}
