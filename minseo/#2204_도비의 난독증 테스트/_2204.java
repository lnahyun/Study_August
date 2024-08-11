package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _2204 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> hashMap = new HashMap<>();
		
		while(true) {
			int n = sc.nextInt();
			if (n==0)
				break;
			String[] str = new String[n]; //새로운 문자열 배열 생성후, str 변수에할당
			for(int i = 0; i<n; i++) {
				str[i] = sc.next();
			}
			for(int j = 0; j<n; j++) {
				String temp = str[j].toLowerCase(); // 모두 소문자 변경하여 변수에저장
				hashMap.put(temp,str[j]);
				str[j] = str[j].toLowerCase(); // 대문자 소문자로 변환
			}
			Arrays.sort(str); //사전순으로 정렬
			System.out.println(hashMap.get(str[0]));
		}	
	}
}
