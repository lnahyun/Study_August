import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int N = Integer.parseInt(br.readLine());
        int[] weight = new int[N]; //몸무게
        int[] height = new int[N]; //키

        //입력값을 몸무게, 키로 나눠서 저장
        for(int i = 0; i<N; i++) {
            String[] value = br.readLine().split(" ");
            weight[i] = Integer.parseInt(value[0]);
            height[i] = Integer.parseInt(value[1]);
        }

        //덩치 비교하기
        int[] grade = new int[N]; //등수를 저장할 배열
        for(int i = 0; i<N; i++) { //5명이니까
            int count = 1;
            for(int k = 0; k<N; k++) {
                if(i == k) //본인과 비교 X
                    continue;
                if(weight[i] < weight[k] && height[i] < height[k])
                    count++;
                grade[i] = count;
            }
        }

        for(int result : grade)
            System.out.print(result + " ");
    }
}
