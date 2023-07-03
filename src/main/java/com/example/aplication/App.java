package com.example.aplication;

import com.example.xadrez.ChessMatch;

public class App {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
