import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine(); //개행문자 지워줌

    //배열 생성
		int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String inputLine = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = inputLine.charAt(j) - '0';
              //charAt는 j+1번째 문자열을 반환함 -'0'은 문자열을 숫자로 만들어주기 위함
            }
        }
		int L = (N<M) ? N : M; // 사각형의 더 짧은 쪽을 저장해두고 반복문의 크기를 결정함
    
		int square = 1;
		
		for(int i = 1; i < L; i++){
			for (int j = 0; j < N - i; j++){ 
				for (int k = 0; k < M - i; k++)
					if(arr[j][k] == arr[j][k+i] && arr[j][k] == arr[j+i][k] && arr[j][k] == arr[j+i][k+i])//3개가 모두 같으면 정사각형이 됨
					square = (i+1)*(i+1);//정사각형의 크기 저장
			}
		}
		System.out.print(square);
		sc.close();
	}
}
