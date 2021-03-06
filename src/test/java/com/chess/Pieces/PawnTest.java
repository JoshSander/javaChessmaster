package com.chess.Pieces;

import com.chess.Board;
import com.chess.Moves.Move;
import com.chess.Moves.Moves;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PawnTest {

    @Test
    public void test1() {
        Board board = new Board();
        Pawn pawn = new Pawn('p', 1,0);
        Moves moves = new Moves();

        pawn.checkMoves(board, moves, null);

        List<Move> move = moves.getMoves();

        assertTrue(move.isEmpty() == false);
    }
}