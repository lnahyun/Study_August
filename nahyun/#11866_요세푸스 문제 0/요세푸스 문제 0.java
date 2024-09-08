import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        String[] N = br.readLine().split(" ");
        int step = Integer.parseInt(N[1]);
        int countIndex = step-1; //인덱스는 0부터 시작이기 때문에 -1을 해줌

        List<Integer> intList = new ArrayList<Integer>();
        for(int i = 1; i <= Integer.parseInt(N[0]); i++) {
            intList.add(i);
        }

        while(!intList.isEmpty()) {
            countIndex = countIndex % intList.size();

            sb.append(intList.get(countIndex) + ", ");
            intList.remove(countIndex);

            countIndex += (step - 1); //위에서 끄집어낸 요소를 remove했기 때문에 인덱스가 조정이 됨. 고려해서 step-1을 해준다.
        }

        sb.setLength(sb.length() - 2); //마지막 요소에도 ", "가 추가되었으므로, 지워준다.
        sb.append(">");
        System.out.print(sb);

    }
}
