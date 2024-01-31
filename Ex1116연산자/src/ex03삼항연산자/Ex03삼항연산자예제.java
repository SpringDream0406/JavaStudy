package ex03삼항연산자;

import java.util.Scanner;

public class Ex03삼항연산자예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		int result = num1>num2 ? num1-num2 : num2-num1;
		System.out.println("두수의 차 : " + result);
		
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num3 = sc.nextInt();
		int result2 = num3%5 == 0 ? num3/5 : num3/5+1; 
		System.out.println("필요한 상자의 수 : "+ result2);
	}
}
