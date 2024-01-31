package 다중if문;

import java.util.Scanner;

public class Ex02학점계산 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 점수 입력 : 출력
		System.out.print("점수 입력 : ");
		// 3. 점수 입력 받기
		int totalScore = sc.nextInt();
		// 4. 학점 계산하기
		// 학점을 담을 변수 생성
		char grade;
		if (totalScore >= 90) {
			// 90점 이상 : A
			grade = 'A';
		} else if (totalScore >= 80) {
			// 80점 이상 90점 미만 : B
			grade = 'B';
		} else if (totalScore >= 70) {
			// 70점 이상 80점 미만 : C
			grade = 'C';
		} else {
			// 70점 미만 : D
			grade = 'D';
		}
		System.out.println(grade+"학점입니다!");
	}
}
