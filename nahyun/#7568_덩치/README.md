# [Silver V] 덩치 - 7568 

[문제 링크](https://www.acmicpc.net/problem/7568) 

|시간 제한|메모리 제한|정답 비율
|:----:|:----:|:----:|
|1초|128MB|56.146%

### 성능 요약

메모리: 15836 KB, 시간: 116 ms



---

### 분류

브루트포스 알고리즘, 구현

---

### 문제 설명

<p>우리는 사람의 덩치를 키와 몸무게, 이 두 개의 값으로 표현하여 그 등수를 매겨보려고 한다. 어떤 사람의 몸무게가 x kg이고 키가 y cm라면 이 사람의 덩치는 (x, y)로 표시된다. 두 사람 A 와 B의 덩치가 각각 (x, y), (p, q)라고 할 때 x > p 그리고 y > q 이라면 우리는 A의 덩치가 B의 덩치보다 "더 크다"고 말한다. 예를 들어 어떤 A, B 두 사람의 덩치가 각각 (56, 177), (45, 165) 라고 한다면 A의 덩치가 B보다 큰 셈이 된다. 그런데 서로 다른 덩치끼리 크기를 정할 수 없는 경우도 있다. 예를 들어 두 사람 C와 D의 덩치가 각각 (45, 181), (55, 173)이라면 몸무게는 D가 C보다 더 무겁고, 키는 C가 더 크므로, "덩치"로만 볼 때 C와 D는 누구도 상대방보다 더 크다고 말할 수 없다.</p>

<p>N명의 집단에서 각 사람의 덩치 등수는 자신보다 더 "큰 덩치"의 사람의 수로 정해진다. 만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1이 된다. 이렇게 등수를 결정하면 같은 덩치 등수를 가진 사람은 여러 명도 가능하다. 아래는 5명으로 이루어진 집단에서 각 사람의 덩치와 그 등수가 표시된 표이다.</p>

<table class="table table-bordered" style="width: 35%;">
	<thead>
		<tr>
			<th style="text-align: center;">이름</th>
			<th style="text-align: center;">(몸무게, 키)</th>
			<th style="text-align: center;">덩치 등수</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">(55, 185)</td>
			<td style="text-align: center;">2</td>
		</tr>
		<tr>
			<td style="text-align: center;">B</td>
			<td style="text-align: center;">(58, 183)</td>
			<td style="text-align: center;">2</td>
		</tr>
		<tr>
			<td style="text-align: center;">C</td>
			<td style="text-align: center;">(88, 186)</td>
			<td style="text-align: center;">1</td>
		</tr>
		<tr>
			<td style="text-align: center;">D</td>
			<td style="text-align: center;">(60, 175)</td>
			<td style="text-align: center;">2</td>
		</tr>
		<tr>
			<td style="text-align: center;">E</td>
			<td style="text-align: center;">(46, 155)</td>
			<td style="text-align: center;">5</td>
		</tr>
	</tbody>
</table>

<p>위 표에서 C보다 더 큰 덩치의 사람이 없으므로 C는 1등이 된다. 그리고 A, B, D 각각의 덩치보다 큰 사람은 C뿐이므로 이들은 모두 2등이 된다. 그리고 E보다 큰 덩치는 A, B, C, D 이렇게 4명이므로 E의 덩치는 5등이 된다. 위 경우에 3등과 4등은 존재하지 않는다. 여러분은 학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력해야 한다.</p>

---

### 입력 

 <p>첫 줄에는 전체 사람의 수 N이 주어진다. 그리고 이어지는 N개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x와 y가 하나의 공백을 두고 각각 나타난다.</p>

 ---

### 출력
<p> 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다. 단, 각 덩치 등수는 공백문자로 분리되어야 한다.</p>

---

### 제한
<p>2 ≤ N ≤ 50 <br>
10 ≤ x, y ≤ 200</p>

---

### 아이디어

#### 슈도코드
```java
입력 처리 :
	정수 N 읽기
	N 길이의 weight(몸무게)배열, height(키)배열 생성 -> int형

for(N번)
	몸무게와 키 입력받기
	: 각 줄을 문자열로 읽어서 공백으로 분리하자!
	: 분리한 순서대로 몸무게, 키 배열에 저장하기

비교하기 :
	등수 저장할 배열 int형으로 생성
	//이중 반복문
	for(N번)
		등수 초기화 : 1 (이유 -> 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1 )
		for(N번) 
			if (본인과 비교하지 않도록 처리)
				continue;
			if (본인 몸무게, 키가 비교할 대상보다 크면) count 증가

출력 :
	for-each루프로 출력
			
```
---

### JAVA 문법 정리

**- 'for-ech'문**

: 배열이나 컬렉션의 요소를 순회(iterate). 인덱스를 사용하지 않고도 각 요소에 접근 가능
```java
for (Type element : collection) {
   // element를 사용하여 작업 수행
}
```

- Type: 컬렉션 또는 배열의 요소 타입
- element: 각 반 복에서 컬렉션 또는 배열의 현재 요소를 저장하는 변수
- collection: 배열이나 Iterable 인터페이스를 구현한 컬렉션 객체

**- 추가 코드 설명**

```java
for(int result : grade)
    System.out.print(result + " ");
```

- for(int result : grade) : grade 배열의 각 요소를 순회(for-each문)
- System.out.print(result + " "); : 줄 바꿈 없이 출력하고, 출력값을 공백으로 구분
