package com.batchtwoproject.array;

import java.util.Scanner;

public class TwoDimensionMatrixSum {

	public static void main(String[] args) {
		try {
			int n, sum = 0;
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many?");
			n = scan.nextInt();
			int[][] arr = new int[n][n];
			System.out.println("Enter the numbers:");
			for (int i = 0 ; i<n ; i++) {
				for(int j = 0 ; j<n ; j++) {
					arr[i][j] = scan.nextInt();
					sum = sum + arr[i][j];
				}
			}
			System.out.println("Sum is " + sum);
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
