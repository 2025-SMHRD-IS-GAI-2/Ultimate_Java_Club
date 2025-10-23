package ex04반복문;

import java.util.Scanner;

public class Ex03While문기초3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while문을 통해서 정수 입력을 반복해서
		// 받는다. 단, 조건은 입력받은 정수가 10보다
		// 작을 때까지!
		// 입력 받은 수가 10보다 크면 -> "종료" 출력
		while (true) {
			// 조건식의 결과가 true인 경우에만 실행!
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			// 여기까지의 코드는 무한반복(입력)
			if (num > 10) {
				System.out.println("종료되었습니다.");
				break;
				// break : 가장 가까이에 있는 조건, 반복문
				// 종료
			}
		}
	}

}
