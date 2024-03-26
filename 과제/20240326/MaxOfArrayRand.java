package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	public static void main(String[] args) {
		int num = getPositivenumber("사람 수 : ");
		
		int height[] = new int[num];
		
		getRandArray(height, 100, 200);
		
		int max = maxOf(height);
		System.out.printf("가장 큰 키는 %dcm입니다.", max);
	}
	
	static void getRandArray(int[] height, int start, int end) {
		Random rand = new Random();
		
		for(int i = 0;i<height.length;i++) {
			height[i]=start + rand.nextInt(end-start);	
			System.out.printf("%d  ",height[i]);
		}

	}
	
	static int getPositivenumber(String message) {
		int num=0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.printf("%s", message);
			num = scanner.nextInt();
		}while(num<=0);
		
		return num;
	}
	
	static int maxOf(int[] arr) {
		int max = arr[0];
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]>max) max=arr[i];
		}
		return max;  
	}

}