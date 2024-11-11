import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else map.put(num, 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] inputCard = new int[M];
        for(int i = 0; i<M; i++) {
            inputCard[i] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i<M; i++) {
            Integer value = map.get(inputCard[i]);
            if(value == null) {
                sb.append(0).append(" ");
            }
            else sb.append(value).append(" ");
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);

    }
 }
