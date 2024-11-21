import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String L = scanner.next();
        String R = scanner.next();

        int count = 0;
        if (L.length() == R.length()) {
            for (int i = 0; i < L.length(); i++) {
                if (L.charAt(i) == '8' && R.charAt(i) == '8') {
                    count++;
                } else if (L.charAt(i) != R.charAt(i)) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
