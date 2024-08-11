package main;

import java.util.Scanner;

public class _1267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //사용한 횟수
		int c; //요금 
		int Y = 0; // 영식
		int M = 0; //민식
		
		for (int i = 0; i < N; i++) {
			c = sc.nextInt();
			Y = Y + ((c/30)+1) * 10; // 영식의 요금제 계산
			M = M + ((c/60)+1) * 15; // 민식의 요금제 계산
		}
		if (Y == M) {
			System.out.println("Y M " + Y);
		}
		else if(Y > M) {
			System.out.println("M " + M);
		}
		else{
			System.out.println("Y "+ Y);
		}
	}
}
