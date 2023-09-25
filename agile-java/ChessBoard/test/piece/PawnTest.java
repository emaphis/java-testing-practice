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
public class PawnTest extends TestCase {

    protected void setUp() throws Exception {
    }

    public void testCreate() {
        Pawn whitePawn = new Pawn(Pawn.WHITE, 'p');
        assertEquals(Pawn.WHITE, whitePawn.getColor());

        Pawn blackPawn = new Pawn(Pawn.BLACK, 'P');
        assertEquals(Pawn.BLACK, blackPawn.getColor());
    }

    public void testPawn() {
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE, pawn.getColor());
    }

    public void testPawnPrintRepresentation() {
        Pawn whitePawn = new Pawn();
        Pawn blackPawn = new Pawn(Pawn.BLACK,'P' );
        assertEquals('P', blackPawn.getRepresentation());
        assertEquals('p', whitePawn.getRepresentation());
    }

}
