package 자판기프로그램;

import java.util.Scanner;

public class Ex01자판기프로그램 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 금액을 입력하세요 출력문 작성
		System.out.println("금액을 입력하세요 >>");
		// 3. 금액 입력 받기
		int money = sc.nextInt();
		// 4. 자판기 메뉴출력
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 이구동성(700원)  2. 썬칩(1000원)  3. 뽀빠이(500원) >>");
		// 5. 메뉴 입력받기
		int menu = sc.nextInt();
		// 6. 사용자가 입력한 메뉴가 무엇인지 판단
		// 판단 ---> 조건문
		// switch, 다중 if문 사용해서
		if (menu == 1 && money >= 700) {
			// 만약에 사용자가 1번을 선택
			// 잔돈 = 지불한 금액 - 700
			money -= 700;
		} else if (menu == 2 && money >= 1000) {
			// 만약에 사용자가 2번을 선택
			// 잔돈 = 지불한 금액 - 1000
			money -= 1000;
		} else if (menu == 3 && money >= 500) {
			// 만약에 사용자가 3번을 선택
			// 잔돈 = 지불한 금액 - 500
			money -= 500;
		} else {
			System.out.println("잘못된 선택이거나 잔액이 부족합니다.");
		}
		System.out.println(menu+"선택, 잔액은 "+money+"입니다.");

	}

}
