package 다중if문;

import java.util.Scanner;

public class Ex01다중if문 {

	public static void main(String[] args) {

		// 사용자로부터 정수를 입력받아서 해당하는 숫자가 0인지, 홀수인지, 짝수인지 판별하는 프로그램을 만들어보자!
		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 숫자를 입력하세요 출력
		System.out.print("숫자를 입력하세요 : ");
		// 3. 숫자 입력 받기
		int num = sc.nextInt();
		// 4. 숫자를 판단해서 0인지, 홀수인지, 짝수인지 판별
		// *** 조건식의 순서 ****
		if (num == 0) {
			// 0인경우
			System.out.println("0입니다.");
		} else if (num % 2 == 0) {
			// num 짝수인 경우
			System.out.println("짝수입니다.");
		} else {
			// num 홀수인 경우
			System.out.println("홀수입니다.");
		}

	}

}
