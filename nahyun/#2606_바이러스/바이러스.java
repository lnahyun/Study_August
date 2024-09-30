import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();

        int computer = Integer.parseInt(br.readLine());
        //탐색에 활용될 2차원 배열 생성
        int[][] search = new int[computer+1][computer+1];

        int linkNum = Integer.parseInt(br.readLine());

        for(int k = 0; k<linkNum; k++) {
            //입력받은 쌍들 2차원 배열에 저장
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            search[i][j] = 1;
            search[j][i] = 1; //무방향 그래프임
        }

        boolean[] check = new boolean[computer+1];
        dfs(1, search, check, set);

        System.out.print(set.size()-1);
        }

        public static void dfs(int node, int[][] search, boolean[] check, Set<String> set) {
            check[node] = true;
            set.add(Integer.toString(node));

            for(int i = 1; i<check.length; i++) {
                if(search[node][i] == 1 && !check[i]) {
                    dfs(i, search, check, set);
                }
            }
        }
    }
