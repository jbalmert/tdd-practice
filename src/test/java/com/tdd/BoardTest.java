package com.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jimmy.balmert on 2/7/17.
 */
public class BoardTest {

    @Test
    public void toStringReturnsInternalState() throws Exception {
        Board board = new Board ("00\n00");

        assertEquals(board.toString(), "00\n00");
    }

    @Test
    public void toStringTotallyReturnsInternalState() throws Exception {
        Board board = new Board ("11\n11");

        assertEquals(board.toString(), "11\n11");

    }
}