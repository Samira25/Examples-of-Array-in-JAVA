package com.batchtwoproject.array;

import java.util.Scanner;

public class DiagonalMatrixSum {

	public static void main(String[] args) {
		int diagonal1 = 0, diagonal2 = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("How many?");
		
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        
        System.out.println("Enter the numbers:");
        
        for (int i = 0 ; i<row ; i++) {
        	for(int j = 0 ; j<col ; j++) {
        		arr[i][j] = scan.nextInt();
        	}
        }
        for (int i = 0 ; i<row ; i++) {
        	diagonal1 = diagonal1 + arr[i][i];
        }
        for (int i = 0 ; i<row ; i++) {
        	diagonal2 = diagonal2 + arr[i][row-1-i];
        }
        System.out.println("Sum of main diagonal is " + diagonal1);
        System.out.println("Sum of opposite diagonal is " + diagonal2);
	}

}
