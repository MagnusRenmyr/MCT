package se.salutea.sweeper.model;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TileTest {

    @Test
    public void testGetIsSweeped() {
        Tile tile = new Tile();

        assertFalse(tile.getIsSweeped() , "getIsSweeped() returnerade inte false för en nyskapad tile");
    }

    @Test
    public void testSetIsSweeped() {
        Tile tile = new Tile();
        assertFalse(tile.getIsSweeped() , "getIsSweeped() returnerade inte false för en nyskapad tile");

        tile.setIsSweeped(true);
        assertTrue(tile.getIsSweeped() , "setIsSweeped() har inte uppdaterat isSweeped()");
    }

    @Test
    public void testGetIsBomb() {
        Tile tile = new Tile();
        assertFalse(tile.getIsBomb() , "getIsBomb() returnerade inte false för en nyskapad tile");
    }

    @Test
    public void testSetIsBomb() {
        Tile tile = new Tile();
        assertFalse(tile.getIsBomb() , "getIsBomb() returnerade inte false för en nyskapad tile");

        tile.setIsBomb(true);
        assertTrue(tile.getIsBomb() , "setIsBomb() har inte uppdaterat isBomb()");
    }
}