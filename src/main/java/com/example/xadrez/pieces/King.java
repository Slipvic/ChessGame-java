package com.example.xadrez.pieces;

import com.example.tabuleiro.Board;
import com.example.xadrez.ChessPiece;
import com.example.xadrez.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);

    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        return mat;
    }

}
