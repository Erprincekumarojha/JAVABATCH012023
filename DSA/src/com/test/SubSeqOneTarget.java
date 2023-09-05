package com.test;

public class SubSeqOneTarget {
	
	public static void main(String[] args) {
		
		int target = 4;
		int arr[] = {1,2,3,4,2};
		subTarget(0, arr, target, 0);
	}

	private static int subTarget(int index, int[] arr, int target, int sum) {
		
		if(index==3 && sum==target) {
			System.out.println(sum);
			return sum;
		}else {
			int l = subTarget(index+1, arr, target, sum);
			int r = subTarget(index+1, arr, target, sum);
			return l+r;
		}
		
	}

}
