package com.java_exercise;

public class AverageOfArray {
	public static void average() {
		double sum=0;
		double avg;
		int[] num = { 10, 20, 30, 40, 50,70 };
		
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println(sum);
		
		avg = sum / num.length;
		System.out.println(avg);

	}
	public static void main(String[] args) {
		average();
	}

}
