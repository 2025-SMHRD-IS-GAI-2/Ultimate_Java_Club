package ex02자료형;

import java.util.Scanner;

public class Ex03붕어빵출력 {

	public static void main(String[] args) {
		// 1. 입력 받는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		// 2. "구매 희망하는 팥붕 개수 " 출력
		System.out.println("구매 희망하는 팥붕개수 :");
		// 3. 팥붕 개수 입력받아서 변수 num에 저장
		//	  ->팥붕 개수 입력받아, 변수 num선언하여 할당
		int num=sc.nextInt();
		// 4. num 출력
		System.out.println("붕어빵의 개수"+num);
		
	}

}
