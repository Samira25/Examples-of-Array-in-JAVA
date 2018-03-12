package com.batchtwoproject.array;

import java.util.Arrays;
import java.util.Scanner;

public class PossibleTriangle {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many?");
			int n = scan.nextInt();
			int[] arr = new int[n];
			int count = 0;
			System.out.println("Enter the numbers:");
			for (int i = 0 ; i<n ; i++) {
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0 ; i < (n-2) ; ++i){
				int x = i+2;
				for (int j = i+1 ; j < n ; ++j){
					if (x < n && (arr[i] + arr[j]) > arr[x]){
						++x;
					}
					count = count + (x - j - 1);
				}
			}
			System.out.println("Total number of triangles: " + count);
		}catch (Exception e){
			System.out.println(e);
		}
	}

}