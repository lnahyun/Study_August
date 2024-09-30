import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computer = Integer.parseInt(br.readLine());
        // 탐색에 활용될 2차원 배열 생성
        int[][] search = new int[computer + 1][computer + 1];

        int linkNum = Integer.parseInt(br.readLine());

        for (int k = 0; k < linkNum; k++) {
            // 입력받은 쌍들 2차원 배열에 저장
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            search[i][j] = 1;
            search[j][i] = 1; // 무방향 그래프
        }

        boolean[] check = new boolean[computer + 1];
        int finalValue = dfs(1, search, check); // 1번 컴퓨터 제외
        System.out.print(finalValue-1);
    }

    public static int dfs(int node, int[][] search, boolean[] check) {
        check[node] = true;
        int count = 1; // 현재 노드를 포함한 감염된 컴퓨터 수

        for (int i = 1; i < check.length; i++) { // 컴퓨터는 1부터 시작
            if (search[node][i] == 1 && !check[i]) {
                count += dfs(i, search, check); // 재귀로 탐색하며 count 증가
            }
        }
        return count;
    }
}
