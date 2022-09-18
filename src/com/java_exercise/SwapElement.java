package com.java_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElement {
	public static void swapElement() {
		int temporary;
		int[] num = { 10, 30, 40, 20, 55 };
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index which you want swap with");
		int ind1=sc.nextInt();
		int ind2=sc.nextInt();
		
		num[ind1]=num[ind1]+num[ind2];
		num[ind2]=num[ind1]-num[ind2];
		num[ind1]=num[ind1]-num[ind2];
		
		System.out.println(Arrays.toString(num));

	}

	public static void main(String[] args) {
		swapElement();
	}

}
