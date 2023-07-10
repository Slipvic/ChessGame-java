package com.example.aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.example.xadrez.ChessException;
import com.example.xadrez.ChessMatch;
import com.example.xadrez.ChessPiece;
import com.example.xadrez.ChessPosition;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try {
				UI.cleanScreen();
				UI.printMatch(chessMatch);
				System.out.println();
				System.out.print("Origem: ");
				ChessPosition source = UI.readChessPosition(sc);
			
				boolean [][] possibleMoves = chessMatch.possibleMoves(source);
				UI.cleanScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);

				System.out.println();
				System.out.print("Destino: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
