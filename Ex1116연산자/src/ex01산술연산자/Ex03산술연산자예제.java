package ex01산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {
	
	public static void main(String[] args) {
		
		// 1. 입력받는 도구 꺼내오
		Scanner sc = new Scanner(System.in);
		// 2. 정수 입력 : 출력하기(개행 없이)
		System.out.print("정수 입력 : ");
		// 3. 정수 입력 받
		int num = sc.nextInt();
		// 4. num의 백의자리 이하를 버리기
		// 1) 백의자리만! 구하기 *100
		int result = num/100*100;
		System.out.println("첫번째 결과 : "+ result);
		// 2) 백의자리 이하의 숫자를 num에서 빼주기!
		int result2 = num-(num%100);
		System.out.println("두번째 결과 : "+ result2);
		
		
		
	}

}
