package ex03삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {
	
	public static void main(String[] args) {
		
		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. '정수를 입력하세요 :' 출력하기(개행없이)
		System.out.print("정수를 입력하세요 : ");
		// 3. 입력도구 사용해서 정수 입력 받기
		int num = sc.nextInt();
		// 4. 입력받은 정수가 홀수인지 짝수인지 판별하기
		// : 머리속에서 홀수 짝수를 판별할때 어떻게 하는지 생각해서 코드로 작성!
		String result = num%2==0 ? "짝수" : "홀수";
		// 5. 결과 출력
		System.out.println(num + "는(은) "+ result +" 입니다.");
		
	}

}
