import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<100) System.out.print(N);
        else {
            System.out.println(countNum(N));
        }
        sc.close();
    }
    static int countNum(int N) {
        int count = 99;
        for (int i = 100; i <= N; i++) {
            if (isHansu(i)) {
                count++;
            }
        }
        return count;
    }
    static boolean isHansu(int num) {
        // 문제 조건에서 N은 1000보다 작거나 같은 자연수라고 나오기에 3자리만 신경쓰면 된다
        int hundred = num / 100;         // 백의 자리
        int ten = (num / 10) % 10;       // 십의 자리
        int one = num % 10;              // 일의 자리

        return (hundred - ten) == (ten - one); // 등차수열인지 확인
    }
}
