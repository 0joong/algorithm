package chap02;

import java.util.Scanner;

public class Numpiramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i=0;i<=num;i++) {
			for(int k = 0;k<num-i;k++) {
				System.out.printf(" ");
			}
			for(int j=0;j<i*2-1;j++) {
				System.out.printf("%d", i);
			}
			System.out.println();
		}

	}

}
