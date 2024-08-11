package main;

import java.util.Scanner;

public class _1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cycle = 0;
		int end =  n;
		
		while(true) {
			n = (n%10*10)+((n/10+n%10)%10);
			cycle ++;
			if(end == n) {
				break;
			}
		}
		System.out.println(cycle);
	}
}
