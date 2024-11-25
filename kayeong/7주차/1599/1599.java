import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinsikDic dic = new MinsikDic();
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        Arrays.sort(words, (word1, word2) -> {
            String s1 = dic.convert(word1);
            String s2 = dic.convert(word2);
            return s1.compareTo(s2);
        });

        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}
class MinsikDic{
    static Map<String, String> minsik;
    MinsikDic(){
        minsik = new HashMap<>();
        minsik.put("a", "a");
        minsik.put("b", "b");
        minsik.put("k", "c");
        minsik.put("d", "d");
        minsik.put("e", "e");
        minsik.put("g", "f");
        minsik.put("h", "g");
        minsik.put("i", "h");
        minsik.put("l", "i");
        minsik.put("m", "j");
        minsik.put("n", "k");
        minsik.put("ng", "l");
        minsik.put("o", "m");
        minsik.put("p", "n");
        minsik.put("r", "o");
        minsik.put("s", "p");
        minsik.put("t", "q");
        minsik.put("u", "r");
        minsik.put("w", "s");
        minsik.put("y", "t");
    }
    String convert(String word) {
        StringBuilder converted = new StringBuilder();
        for (int i = 0; i < word.length(); ) {
            if (i < word.length() - 1 && word.substring(i, i + 2).equals("ng")) {
                converted.append(minsik.get("ng"));
                i += 2;
            } else {
                converted.append(minsik.get(String.valueOf(word.charAt(i))));
                i++;
            }
        }
        return converted.toString();
    }
}
