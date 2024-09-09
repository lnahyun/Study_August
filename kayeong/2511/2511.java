import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        int[] playerA = new int[10];

      //A 입력 받기
        for (int i = 0; i < 10; i++) {
            playerA[i] = scanner.nextInt();
        }
      //B 입력 받기
        int[] playerB = new int[10];
        for (int i = 0; i < 10; i++) {
            playerB[i] = scanner.nextInt();
        }

      //게임하기
        char[] results = new char[10];
        int scoreA = 0; //A의 변수를 저장
        int scoreB = 0; //B의 변수를 저장
        for (int i = 0; i < 10; i++) {
            if (playerA[i] > playerB[i]) {
                results[i] = 'A';
                scoreA += 3;
            } else if (playerB[i] > playerA[i]) {
                results[i] = 'B';
                scoreB += 3;
            } else {
                results[i] = 'D';
                scoreA += 1;
                scoreB += 1;
            }
        }
      
      //결과 출력
        System.out.println(scoreA +" "+ scoreB);
        if (scoreA > scoreB) {
            System.out.println("A");
        } else if (scoreB > scoreA) {
            System.out.println("B");
        } else { // 점수가 동일한 경우
            for (int i = 9; i >= 0; i--) {
                if (results[i] == 'A') { 
                    System.out.println("A");
                    break;
                }
                else if (results[i] == 'B') {
                    System.out.println("B");
                    break;
                }
                else if(i == 0)
                	System.out.println("D");
            }
        }
        scanner.close();
    }
}
