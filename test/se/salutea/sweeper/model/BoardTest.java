package se.salutea.sweeper.model;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BoardTest {

    @Test
    public void testCreateBoard() {
        int suppliedWidth = 6;
        int suppliedHeight = 10;

        Board board = new Board(suppliedWidth , suppliedHeight);

        assertEquals(suppliedWidth , board.getWidth() , "Svaret från getWidth() matchar inte bredden som planen skapades med");
        assertEquals(suppliedHeight , board.getHeight() , "Svaret från getHeight() matchar inte höjden som planen skapades med");

        assertEquals(board.getTiles().length , suppliedWidth , "Returnerade felaktig bredd på tile-arrayen");
        assertEquals(board.getTiles()[suppliedWidth - 1].length , suppliedHeight , "Returnerad felaktig höjd på sista kolumnen i tile-arrayen");
    }
}