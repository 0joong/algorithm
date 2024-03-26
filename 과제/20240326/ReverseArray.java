package chap02;

import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("얼마나 크게 할까요?? ");
		int numarr[] = new int[scanner.nextInt()];
		
		getRandArray(numarr);
		
		System.out.println("비포");
		displayarr(numarr);
		
		swap(numarr);
		
		System.out.println("애프터");
		displayarr(numarr);
	}
	static void swap(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i-1];
			arr[arr.length - i-1] = temp;
		}	
	}
	static void displayarr(int[] numarr) {
		for(int i =0;i<numarr.length;i++) {
			System.out.printf("%d ", numarr[i]);
		}
		System.out.println();
	}
	static void getRandArray(int[] arr) {
		Random rand = new Random();
		
		for(int i = 0;i<arr.length;i++) {
			arr[i]=rand.nextInt(10);	
		}
	}
}