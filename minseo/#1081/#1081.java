import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char[][] chess = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for(int j = 0; j < m; j++) {
                chess[i][j] = line.charAt(j);
            }
        }
        int minPaint = Integer.MAX_VALUE;

        for(int i = 0; i <= n-8; i++) {
            for(int j = 0; j <= m-8; j++) {
                minPaint = Math.min(minPaint,getminPaint(chess,i,j));
            }
        }
        System.out.println(minPaint);
    }
    private static int getminPaint(char[][] chess, int x, int y) {
        int countB = 0;
        int countW = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char startB = ((i + j) % 2 == 0) ? 'B' : 'W';
                char startW = ((i + j) % 2 == 0) ? 'W' : 'B';
                if (chess[x+i][y+j] != startB) countB++;
                else if (chess[x+i][y+j] != startW) countW++;
            }
        }
        return Math.min(countB,countW);
    }
}
