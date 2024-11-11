import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer>dic = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String word = sc.next();
            //dic : 단어와 그 단어의 빈도수를 저장할 HashMap
            dic.put(word, dic.getOrDefault(word, 0) + 1);
        }
        int max = 0; //현재까지 가장 많이 나온 단어 빈도수
        String mostword = null; //가장 많이 등장한 단어를 저장할 변수
        for(Map.Entry<String, Integer> entry : dic.entrySet()){
            int frequency = entry.getValue();
            String word = entry.getKey();
            if(entry.getValue()>max){
                max = entry.getValue();
                mostword = entry.getKey();
            }
            else if(frequency == max && (mostword == null || word.compareTo(mostword)<0)){
                mostword = word;
            }
        }
        System.out.println(mostword);
    }
}
