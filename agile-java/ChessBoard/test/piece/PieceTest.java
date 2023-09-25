/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piece;

import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class PieceTest extends TestCase {

    protected void setUp() throws Exception {
    }

    public void testCreate() {
        Piece whitePawn = new Piece(Piece.WHITE, 'p');
        assertEquals(Piece.WHITE, whitePawn.getColor());

        Piece blackPawn = new Piece(Piece.BLACK, 'P');
        assertEquals(Piece.BLACK, blackPawn.getColor());
    }

    public void testPawn() {
        Piece pawn = new Piece();
        assertEquals(Piece.WHITE, pawn.getColor());
    }

    public void testPawnPrintRepresentation() {
        Piece whitePawn = new Piece();
        Piece blackPawn = new Piece(Piece.BLACK,'P' );
        assertEquals('P', blackPawn.getRepresentation());
        assertEquals('p', whitePawn.getRepresentation());
    }

}
