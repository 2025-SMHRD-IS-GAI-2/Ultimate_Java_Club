package ex04반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex04플러스게임 {

	public static void main(String[] args) {
		// 랜덤으로 정수 뽑기
		// 0. 랜덤 도구 가져오기
		// -> scanner와 유사한 방식!
		// int num =sc,nextInt();
		// rd.nextInt(5) -> 5개의 정수 중에서
		// 랜덤하게 추출(0~4 => 5개)
		// 0~4 (결과값 +1) => 1~5
		// 0. 문구 출력
		// 1. 랜덤하게 정수를 추출해서 정수형변수에
		// 저장!
		// 2. num1 + num2 출력
		// 3. num1과 num2의 합을 입력받기
		// 4. 조건문을 이용하여 입력된 값이 실제
		// num1과 num2의 합과 일치하면
		// "성공" 출력, 다르면 "실패"출력
		// * ctrl / -> 주석 처리
		// * ctrl shift / -> 여러줄의 주석처리
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("----plus game----");
		int num1 = rd.nextInt(8) + 1;
		int num2 = rd.nextInt(8) + 1;
		while (true) {
			System.out.print(num1 + "+" + num2 + "=");
			int num3 = sc.nextInt();
			if ((num1 + num2) == num3) {
				System.out.println("성공성공");
			} else {
				System.out.println("실패");
				System.out.print("계속 진행하시겠습니까?");
				// 진행 여부에 대한 답 입력 받기(Y/N)
				String answer = sc.next();
				// 값이 동등한지 비교할때
				// - 기본 자료형(int, boolean..) :
				// - 참조(레퍼런스) 자료형(String..) : equals
				if (answer.equals("N")||answer.equals("n")) {
					System.out.println("종료합니다");
					break;
				}
			}
		}
	}

}
