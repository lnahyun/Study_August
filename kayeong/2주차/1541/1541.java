import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
    
        int currentNumber = 0; //최근 입력된 숫자
        int totalSum = 0; //전체 결과값 변수
        boolean firstMinus = false; //-가 나왔는지 확인하는 변수
    
        for (char ch : expression.toCharArray()) { //toCharArray가 expression을 문자열로 변환시킴
            if (Character.isDigit(ch)) //isDigit은 숫자인지 확인해주는 함수 숫자면 true를 반환
                currentNumber = currentNumber * 10 + (ch - '0'); //이 전에 입력 받은 수에 10을 곱하면서 숫자를 저장하면 원래 입력한 숫자를 알 수 있음
            else if (ch == '+' || ch == '-') {
                if (firstMinus) 
                    totalSum -= currentNumber; //- 이후로는 다 -로 만들면 수가 최소가 됨
                else
                	totalSum += currentNumber;
                currentNumber = 0;
                if (ch == '-') firstMinus = true;
            }
        }
          //마지막 숫자처리
          if (firstMinus) 
              totalSum -= currentNumber;
          else 
            totalSum += currentNumber;
    
        System.out.println(totalSum); //결과 출력
        scanner.close();
	}
}
