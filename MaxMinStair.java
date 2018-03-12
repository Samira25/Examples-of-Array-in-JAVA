package com.batchtwoproject.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinStair {

	static int[] stair(int[] area, int n) {
		int[] temp = new int[n];
		int small_num =0, large_num = n-1;
		boolean flag = true;
		for (int i = 0 ; i < n ; i++){
			if (flag){
				temp[i] = area[large_num--];
			}
			else {
				temp[i] = area[small_num++];
			}
			flag = !flag;
		}
		return temp;
	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("How many?");
			int x = scan.nextInt();
			int[] num = new int[x];
			System.out.println("Enter the numbers:");
			for (int i = 0 ; i<x ; i++) {
				num[i] = scan.nextInt();
			}
			int[] res = stair(num, num.length);
			System.out.println(Arrays.toString(res));
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
