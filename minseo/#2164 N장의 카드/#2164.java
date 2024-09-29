package java_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2164 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i<= N; i++){
            q.offer(i);
        }
        while(q.size() > 1){
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());
    }
}
