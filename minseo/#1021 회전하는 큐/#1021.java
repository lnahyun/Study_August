import java.util.LinkedList;
import java.util.Scanner;


public class Main {
   static LinkedList<Integer> q = new LinkedList<>();
    public static void main(String[] args) {
        int N, M;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] temp = new int[M];
        for(int i = 0; i< M; i++){
            temp[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            q.add(i+1);
        }
        for(int i = 0; i< M; i++){
            if(check(temp[i])){
                while(temp[i] != q.get(0)){
                    q.addLast(q.pollFirst());
                    count++;
                }
            }
            else{
                while(temp[i] != q.get(0)){
                    q.addFirst(q.pollLast());
                    count++;
                }
            }
            q.poll();
        }
        System.out.println(count);
        sc.close();
    }
    public static boolean check(int num) {
        for (int i = 0; i <= q.size() / 2; i++) {
            if (num == q.get(i))
                return true;
        }
        return false;
    }
}
