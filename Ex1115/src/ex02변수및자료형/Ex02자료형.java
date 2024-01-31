package ex02변수및자료형;

public class Ex02자료형 {
	
	public static void main(String[] args) {
		
		// 기본 자료형
		// 1) 논리 자료형 : boolean (1byte)
		// 참이라는 데이터를 저장하는 bool 이라는 변수 선언
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
		
		// 2) 문자 자료형 : char (2byte)
		// : 홀따옴표를 사용해서 작성, 한 글자만 들어갈 수 있다.
		char name = '임';
		
		// 문자열 자료형(기본 자료형은 아님!!)
		// String : 쌍따옴표를 사용해서 작성, 여러글자가 들어갈 수 있다.
		String name2 = "임경남";
		
		System.out.println(name);
		System.out.println(name2);
		
		
		// 3)
		// ---> 작은 크기를 가진 데이터 자료형을 큰 크기의 자료형으로 옮겨 담을 때, 자동형이 변환!
		long num2 = 12345;

		System.out.println(num2);
		
		
		// 4) 실수 자료형
		// float(4byte), double(8byte) >> 기본값 double
		// 3.14라는 데이터를 담는 float 형태의 변수 num3를 선언
		float num3 = (float) 3.14;
		float num4 = 3.14f;
		System.out.println(num4);
		
		
	}

}
