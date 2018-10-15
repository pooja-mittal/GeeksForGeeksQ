package com.Arrays.questions.sorting;

import java.util.Arrays;

public class AlternateSorting {

	public static void main(String[] args) {
		int[] a = {7, 1, 2, 3, 4, 5, 6,9};
		int n=a.length;
		int i=0; int j=n-1;
		Arrays.sort(a);
		while(i<j) {
			System.out.print(a[j--] +  " ");
			System.out.print(a[i++] + " ");
		}
		if(n%2!=0) {
			System.out.print(a[j]+ " ");
		}
		

	}

}
