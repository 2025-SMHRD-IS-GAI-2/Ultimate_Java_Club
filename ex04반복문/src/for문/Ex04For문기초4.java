package for문;

import java.util.Scanner;

public class Ex04For문기초4 {

	public static void main(String[] args) {
		// 정수를 입력 받아서
		// 해당 정수*1부터 정수 *10까지
		// 출력하기
		// 입력받은 값 * (1~10 중 한개)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=1 ; i<=10; i++) {
			System.out.print((num*i)+" ");			
			}	
		
	}

}
