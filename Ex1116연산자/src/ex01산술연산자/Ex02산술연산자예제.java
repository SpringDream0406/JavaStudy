package ex01산술연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {
	
	public static void main(String[] args) {
		// 개행 없이 출 하고 싶을 때는
		// System.out.print()
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. '첫번째 정수 입력 :' 문자 출력
		System.out.print("첫번째 정수 입력 : ");
		// 3. 입력도구를 사용해 정수 입력 받기
		int num1 = sc.nextInt();
		// 4. '두번째 정수 입력 :' 문자 출력
		System.out.print("두번째 정수 입력 : ");
		// 5. 입력도구를 사용해 정수 입력 받기
		int num2 = sc.nextInt();
		// 6. '더한 결과값 출력 :' (연산까지!!)
		System.out.println("더한 결과 값 : "+(num1+num2));
		System.out.println("뺀 결과 값 : "+(num1-num2));
		System.out.println("곱한 결과 값 : "+num1*num2);
		System.out.println("나눈 결과 값 : "+((double)num1/num2));
		
		

	}

}
