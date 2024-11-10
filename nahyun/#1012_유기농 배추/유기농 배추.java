import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int h = 0; h<T; h++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int arr[][] = new int[M][N];

            //배추 입력하기
            int K = Integer.parseInt(st.nextToken());
            for(int i = 0; i<K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }

            //검사하기
            int count = 0;
            for(int i = 0; i<M; i++) {
                for(int k = 0; k<N; k++) {
                    if(arr[i][k] == 1){
                        count++;
                        dfs(i, k, arr, N, M);
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
    static void dfs(int i, int k, int[][] arr, int N, int M) {//오버플로우 방지 조건
        if(i<0 || k<0 || i >=M || k>= N || arr[i][k] == 0)
            return;
        
        arr[i][k] = 0; //방문처리
        dfs(i-1, k, arr, N, M);
        dfs(i, k+1, arr, N, M);
        dfs(i + 1, k, arr, N, M);
        dfs(i, k - 1, arr, N, M);
        }
    }
