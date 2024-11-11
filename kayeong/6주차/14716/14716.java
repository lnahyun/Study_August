import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] H = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                H[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (H[i][j] == 1) {
                    search(H, i, j, M, N);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void search(int[][] H, int x, int y, int M, int N) {
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        Stack<Point> stack = new Stack<>();
        stack.push(new Point(x, y));
        H[x][y] = -1;

        while (!stack.isEmpty()) {
            Point p = stack.pop();
            x = p.getX();
            y = p.getY();

            for (int i = 0; i < 8; i++) {
                int fx = x + dx[i];
                int fy = y + dy[i];

                if (fx >= 0 && fx < M && fy >= 0 && fy < N && H[fx][fy] == 1) {
                    stack.push(new Point(fx, fy));
                    H[fx][fy] = -1;
                }
            }
        }
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
