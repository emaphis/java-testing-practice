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
    
    public void testCreate() {
        Pawn whitePawn = new Pawn(Pawn.WHITE);
        assertEquals(Pawn.WHITE, whitePawn.getColor());
        
        Pawn blackPawn = new Pawn(Pawn.BLACK);
        assertEquals(Pawn.BLACK, blackPawn.getColor());
    }
 
    public void testPawn() {
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE, pawn.getColor());
    }
}
