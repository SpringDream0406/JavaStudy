package 단순if문;

import java.util.Scanner;

public class Ex03단순if문예제 {

	public static void main(String[] args) {

		// 편리한 단축키
		// 코드 옮기기 : alt + 방향키(위, 아래)
		// 코드 예쁘게 정렬 : ctrl + shift + f
		// 코드 한줄 삭제 : ctrl + d
		

		// 1. 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 정수 입력하세요 출력
		System.out.print("정수를 입력하세요 : ");
		// 3. int 타입의 num에 정수 입력 받기
		int num = sc.nextInt();
		// 4. num의 값이 3의 배수이면서 5의 배수인지 판별
		if (num % 3 == 0 && num % 5 == 0) {
			// 5. 3과 5의 배수라면 "3과 5의 배수입니다." 라고 출력
			System.out.println("3과 5의 배수입니다.");
		}

	}

}
