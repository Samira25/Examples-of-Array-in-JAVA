package com.batchtwoproject.array;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveElementLength {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many?");
			int n = scan.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the numbers:");
			for (int i = 0 ; i < n ; i++) {
				arr[i] = scan.nextInt();
			}
			for (int i = 0 ; i < n ; i++) {
				System.out.println(arr[i] + " ");
			}
			System.out.println("\nThe new length of the array is: " + longest_sequence(arr));
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public static int longest_sequence(int[] arr){
		final HashSet<Integer> h_set = new HashSet<Integer>();
		for (int i : arr) h_set.add(i);
		int long_seq_len = 0;
		for (int i : arr) {
			int len = 1;
			for (int j = i-1 ; h_set.contains(j) ; --j){
				h_set.remove(j);
				++len;
			}
			for (int j = i+1 ; h_set.contains(j) ; ++j){
				h_set.remove(j);
				++len;
			}
			long_seq_len = Math.max(long_seq_len, len);
		}
		return long_seq_len;
	}

}
