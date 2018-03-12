package com.batchtwoproject.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many string?");
			int n = scan.nextInt();
			String a[] = new String[n];
			System.out.println("Enter string:");
			for(int i = 0 ; i < a.length ; i++) {
				a[i] = scan.next();
			}
			Arrays.sort(a);
			System.out.println("Sorted string:");
			for (String anA : a) {
				System.out.println(anA);
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
