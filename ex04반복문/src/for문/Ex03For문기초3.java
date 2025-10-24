package for문;

public class Ex03For문기초3 {

	public static void main(String[] args) {
		// for문을 사용해서 21부터
		// 57까지의 정수 중에서 홀수만 
		// 출력하세요!
		// 출력예시 : 21 23 25 27
		for(int i=21 ; i<58; i++) {
			if(i%2==1) {
			System.out.print(i+" ");
			}
		}
		// Q2. 1~100까지의 정수중에서
		//	   3의 배수만을 출력하세요
		// 3으로 나눴을때, 나머지 0
		for(int i=1 ; i<=100; i++) {
			if(i%3==0) {
			System.out.print(i+" ");
			} 
		}
	}

}
