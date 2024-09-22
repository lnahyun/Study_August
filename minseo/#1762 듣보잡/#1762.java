import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        List<String> listExam = new ArrayList<String>();
        String temp = br.readLine();
        String[] arr = temp.split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        //str1에 듣도못한 사람 담음
        for(int i = 0; i < N; i++) {
            String str1 = br.readLine();
            set.add(str1);
        }
        for(int j = 0; j < M; j++) {
            String str2 = br.readLine();
            if(set.contains(str2)) {
                listExam.add(str2);
            }
        }
        System.out.println(listExam.size());
        Collections.sort(listExam);
        for(int i = 0; i < listExam.size(); i++) {
            System.out.println(listExam.get(i));
        }
    }
}
