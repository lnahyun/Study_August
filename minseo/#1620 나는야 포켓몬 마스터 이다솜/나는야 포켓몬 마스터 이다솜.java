import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        String[] arr = temp.split(" ");
        // 한 줄에 26 5 를 받고 공백을 제외해서 26,5 배열을 반환
        // arr[0] = "26", arr[1] = "5";
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        //포켓몬 이름으로 번호찾기
        HashMap<String, Integer> NameToNumber = new HashMap<>();
        //포켓몬 번호로 포켓몬 이름찾기
        HashMap<Integer, String> NumberToName = new HashMap<>();

        //양방향으로 문자와 번호 대입
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            NameToNumber.put(name, i);
            NumberToName.put(i, name);
        }
        for (int j = 0; j < M; j++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                int number = Integer.parseInt(query);
                System.out.println(NumberToName.get(number));
            } else {
                System.out.println(NameToNumber.get(query));
            }
        }
    }
}
