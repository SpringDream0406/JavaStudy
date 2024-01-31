package if_else문;

import java.util.Scanner;

public class Ex03ifelse예제 {
	
	public static void main(String[] args) {
		
		// 에버랜드 입장객의 나이와 숫자를 입력받아 입장료를 계산해주는 프로그램!
		// 1. 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		// 2. 나이를 입력하세요 출력하기
		System.out.print("나이를 입력하세요 : ");
		// 3. 나이 입력받기
		int age = sc.nextInt();
		// 4. 인원수를 입력받으세요 출력하기
		System.out.println("인원수를 입력하세요.");
		// 5. 인원수 입력받기
		int num = sc.nextInt();
		// 6. 입장료 계산하기
		int pay = 0;
		// 6-1. 나이가 20세 미만이라면 입장료 50% 할인(기본입장료 : 5000원)
		if (age<20) {
			pay = 2500;
		} else {
			// 6-2. 그렇지 않은 경우는 입장료 그대로 계산(기본입장료 : 5000원)
			pay = 5000;
		}
		// 7. 결과 출력하기
		System.out.println(pay*num);
		
	}

}
