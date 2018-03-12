package com.batchtwoproject.array;

import java.util.Arrays;
import java.util.Scanner;

public class SeparatePositiveAndNegative {
	
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many?");
			int n = scan.nextInt();
			int[] arr = new int[n];
			int temp;
			System.out.println("Enter the numbers:");
			for (int i = 0 ; i<n ; i++) {
				arr[i] = scan.nextInt();
			}
			for (int i = 0 ; i<n ; i++) {
				int j = i;
				while ((j > 0) && (arr[j] > 0) && (arr[j-1] < 0)){
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] =temp;
					j--;
				}
			}
			System.out.println(Arrays.toString(arr));
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
