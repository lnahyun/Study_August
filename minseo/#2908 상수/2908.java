import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); //정수 입력받아 A에 저장
        int B = in.nextInt(); //정수 입력받아 B에 저장

        in.close(); // 위에서 입력한 A, B 는 또 쓰지 않을거라 닫음

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        System.out.print(A > B ? A : B);
    }
}
