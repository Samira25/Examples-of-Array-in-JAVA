package com.batchtwoproject.array;

import java.util.Scanner;

public class OneDimensionMatrixSumAndAvg {

	public static void main(String[] args) {
		try {
			double sum = 0, avg = 0;
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter no. of elements you want in array:");
			int n = scan.nextInt();
			int a[] = new int[n];
			System.out.println("Enter all the elements:");
			for(int i = 0; i < a.length; i++)
			{
				a[i] = scan.nextInt();
				sum = sum + a[i];
				avg = sum / a[i];
			}
			System.out.println("Sum is: " + sum);
			System.out.println("Average is: " + avg);
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
