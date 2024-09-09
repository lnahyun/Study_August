
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //BufferedWriter : 출력에 사용되며 여러줄의 데이터를 한 번에 출력할 수 있게 함
        int N = Integer.parseInt(br.readLine());
        //숫자를 읽고 정수로 변환
        //기본형이 아닌 List개열 중에 써야한다. Collections.sort()를 쓰기 위해 Arrays.sort보다 빠름
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        br.close();

        Collections.sort(list);
        //오름차순으로 정렬 ( 처음 array사용시 시간초과떠서 찾아서 사용)
        for(int i : list){  //list에서 요소들을 하나씩 꺼냄
            bw.write(i + "\n"); //i 출력 후 줄바꿈
        }


        bw.flush(); // 현재까지 버퍼에 기독된 내용 출력
        bw.close(); // 스트림 닫고 자원 반환


    }
}
