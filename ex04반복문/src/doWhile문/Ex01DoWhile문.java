package doWhile문;

public class Ex01DoWhile문 {

	public static void main(String[] args) {
		// do-while문
		// do {}안의 실행문장을 무조건 1번
		// 실행하고 while문 조건에 충족하면
		// do실행문장을 실행한다~
		int num1 =1;
		do {
			System.out.println(num1);
			num1++;
		}while(num1<6);
		
		System.out.println("반복끝!");
	}

}
