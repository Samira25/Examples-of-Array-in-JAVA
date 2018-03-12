package com.batchtwoproject.array;

import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many?");
			int n = scan.nextInt();
			int[] arr = new int[n];
			int num = 8;
			System.out.println("Enter the numbers:");

			for (int i = 0 ; i<arr.length ; i++) {
				arr[i] = scan.nextInt();
			}
			int total_sum = num * ((num + 1) / 2);
			int sum = 0;
			for (int i : arr) {
				sum = sum + i;
			}
			System.out.println(total_sum - sum);
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
