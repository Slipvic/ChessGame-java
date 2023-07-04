package com.example.aplication;

import java.util.Scanner;

import com.example.xadrez.ChessMatch;
import com.example.xadrez.ChessPiece;
import com.example.xadrez.ChessPosition;

public class App {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Origem: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Destino: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}
    }
