package com.Arrays.questions.sorting;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortAccToDiff {

	public static void main(String[] args) {
		int a[] = {10, 5, 3, 9, 2};
		int k=7;
		int b[] = new int[a.length];
		int j=0;
		int diff;
		Map<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++) {
			diff=Math.abs(a[i]-k);
			map.put(a[i], diff);
		}
		TreeMap<Integer, Integer> treeS=new TreeMap<Integer, Integer>();
		treeS.putAll(map);
		for(Map.Entry<Integer, Integer> entry: treeS.entrySet()) {
			System.out.print(entry.getKey()+  " ");
			
		}
	}

}
