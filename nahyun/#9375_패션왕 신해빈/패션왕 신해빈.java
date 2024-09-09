```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int tCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < tCase; i++) {
            int num = Integer.parseInt(br.readLine());
            // 옷 종류들 map 에 저장
            for(int j = 0; j<num; j++) {
                String[] clothes = br.readLine().split(" ");
                String key = clothes[1];
                if(map.containsKey(key))
                    map.put(key, map.get(key) + 1);
                else map.put(key, 2); //아무것도 안 입은 경우를 생각하여 2로 추가해준다
            }

            //계산
            int Sum = 1;
            for(int val : map.values())
                Sum *= val;

            //알몸인 경우는 제외
            System.out.println(Sum - 1);

            map.clear();
        }
    }
}
```
