package com.example.xadrez;

import com.example.tabuleiro.Board;
import com.example.tabuleiro.Piece;
import com.example.tabuleiro.Position;

public abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount; 

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected void increaseMoveCount(){
        moveCount++;
    }
    protected void decreaseMoveCount(){
        moveCount--;
    }
    public int getMoveCount(){
        return moveCount;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}
