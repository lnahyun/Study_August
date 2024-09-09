
import java.util.Scanner;
public class Main {
   public static void main(String[] args){

       Scanner in = new Scanner(System.in);

       int N = in.nextInt();
        int count = 0;
       for(int i = 0; i < N; i++){
           boolean decimal = true; //boolean 사용하여 소수일때 true

           int num = in.nextInt();

           if(num == 1){
               continue;
           }
           for(int j =2; j < Math.sqrt(num);j++){ //Math.sqrt 숫자의 제곱근
               if(num % j == 0){
                   decimal = false;
                   break;
               }
           }
           if(decimal){
               count ++;
           }
       }
       System.out.println(count);
   }
}
