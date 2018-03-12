package com.batchtwoproject.array;

import java.util.Arrays;
import java.util.Scanner;

public class SeparateZeroAndOne {

	static int[] separate_zero_one(int[] num, int n){
		int count = 0;
		for (int i = 0 ; i < n ; i++){
			if (num[i] == 0){
				count++;
			}
		}
		for (int i = 0 ; i < count ; i++){
			num[i] = 0;
		}
		for (int i = count ; i < n ; i++){
			num[i] = 1;
		}
		return num;
	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many?");
			int n = scan.nextInt();
			int[] num = new int[n];
			System.out.println("Enter the numbers:");
			for (int i = 0 ; i<n ; i++) {
				num[i] = scan.nextInt();
			}
			int[] res = separate_zero_one(num, num.length);
			System.out.println(Arrays.toString(res));
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
