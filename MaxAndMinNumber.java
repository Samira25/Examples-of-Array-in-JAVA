package com.batchtwoproject.array;

import java.util.Scanner;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		try {
			double numbers[] = new double[500];
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many string?");
			int n = scan.nextInt();

			System.out.println("Enter numbers:");
			for(int i = 0 ; i <= n ; i++) {
				numbers[i] = scan.nextDouble();
			}

			double smallest = numbers[0];
			double largest = numbers[0];

			for(int i = 0 ; i <= n; i++) {
				if(numbers[i] > largest) {
					largest = numbers[i];
				}
				else if (numbers[i] < smallest) {
					smallest = numbers[i];
				}
			}

			System.out.println("Largest Number is : " + largest);
			System.out.println("Smallest Number is : " + smallest);
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
