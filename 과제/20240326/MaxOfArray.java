package chap02;

import java.util.Random;

public class MaxOfArray {

	public static void main(String[] args) {
		int numArr[] = {32, 34, 67, 30, 69};
		
		int max = maxOf(numArr);
		System.out.printf("최대값은 %d입니다.", max);

	}
	
	static int maxOf(int[] arr) {
		int max = arr[0];
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]>max) max=arr[i];
		}
		return max;  
	}

}
