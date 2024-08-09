# [Bronze Ⅰ] 수 정렬하기 3 - 10989

[문제 링크](https://www.acmicpc.net/problem/10989)

| 시간 제한 | 메모리 제한 | 정답 비율 
|----|:----|:----:|
| 3초 | 512 MB | 23.799%

### 성능 요약

메모리: 417236 KB, 시간: 2600 ms

---
### 문제

N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

---

### 입력

첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

---

### 출력

첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

---

### 예제 입력 1 
10
5
2
3
1
4
2
3
5
1
7

### 예제 출력 1 
1
1
2
2
3
3
4
5
5
7

---

### 아이디어

일단 메모리 제한 (수의 범위가 꽤 넓다), 그 수를 출력하려면 많은 시간이 소요되므로 시간이 가장 적게 걸리고, 메모리를 가장 적게 쓰는 최적화된 코드를 짜야했다.

---

### 코드

```java
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
```

---

### JAVA 문법 정리

**- BufferedReader vs Scanner**

**- StringBuilder vs System.out.println**
