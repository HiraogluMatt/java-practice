package day29_methods01;

import java.util.Arrays;

public class Assignment134 {
	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
		// WRITE YOUR CODE HERE
		char letter = 'a';
		int num = 1;
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard[i].length; j++) {
				chessBoard[i][j] = num + "" + letter;
				letter++;
			}
			letter = 'a';
			num++;
		}
		// DO NOT CHANGE
		System.out.println(Arrays.deepToString(chessBoard));
	}
}
