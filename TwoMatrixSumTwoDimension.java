package com.batchtwoproject.array;

import java.util.Scanner;

public class TwoMatrixSumTwoDimension {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many?");

			int row = scan.nextInt();
			int col = scan.nextInt();
			int[][] arr1 = new int[row][col];
			int[][] arr2 = new int[row][col];
			int[][] sum = new int[row][col];

			System.out.println("Enter the numbers of first elements:");

			for (int i = 0 ; i<row ; i++) {
				for(int j = 0 ; j<col ; j++) {
					arr1[i][j] = scan.nextInt();
				}
			}

			System.out.println("Enter the numbers of second elements:");

			for (int i = 0 ; i<row ; i++) {
				for(int j = 0 ; j<col ; j++) {
					arr2[i][j] = scan.nextInt();
				}
			}
			for (int i = 0 ; i<row ; i++) {
				for(int j = 0 ; j<col ; j++) {
					sum[i][j] = arr1[i][j]  + arr2[i][j];
				}
			}
			System.out.println("Sum of two matrix is:");
			for (int i = 0 ; i<row ; i++) {
				for(int j = 0 ; j<col ; j++) {
					System.out.print(sum[i][j] + "\t");
				}
				System.out.println();
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
