package 단순if문;

import java.util.Scanner;

public class Ex02단순if문예제 {
	
	public static void main(String[] args) {
		
		// 1. 입력 도구 꺼내오
		Scanner sc = new Scanner(System.in);
		// 2. 나이를 입력하세요 출
		System.out.print("나이를 입력하세요 : ");
		// 3. int타입 age에 나이 입력 받
		int age = sc.nextInt();
		// 4. age가 20보다 크거나 같은지 판
		if(age>=20) {
			// 5. age가 20보다 크거나 같으면 "성인입니다." 출력
			System.out.println("성인입니다");
		}
		
	}

}
