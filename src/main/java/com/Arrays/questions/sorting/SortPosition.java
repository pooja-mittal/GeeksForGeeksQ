package com.Arrays.questions.sorting;

public class SortPosition {

	public static void main(String[] args) {
		int a[] = {6, 5, 3, 2, 8, 10, 9};
		int k=3;
		for(int i=0; i<k; i++) {
			for(int j=i+1; j<=k; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+  " ");
		}
		

	}

}
