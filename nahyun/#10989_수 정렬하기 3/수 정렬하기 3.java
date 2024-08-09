import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] IntArr = new int[N];

        for(int i = 0; i<N; i++) {
            IntArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(IntArr);

        for(int i = 0; i<N; i++) {
            sb.append(IntArr[i] + "\n");
        }

        System.out.print(sb);
    }
}
