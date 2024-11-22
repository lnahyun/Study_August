import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine(); // 문서
        String searchWord = sc.nextLine(); //두번째 입력 (검색하려는 단어)
        int answer = 0;
        while(words.contains(searchWord)) {
            words = words.replaceFirst(searchWord, "_"); // 문자열 치환
            answer++;
        }
        System.out.println(answer);
    }
}
