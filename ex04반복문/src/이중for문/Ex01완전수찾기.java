package 이중for문;

public class Ex01완전수찾기 {

	public static void main(String[] args) {
		// 완전수 : 자신의 약수 중에서 자신을 제외한 모든 약수의 합이
	      // 자신과 같다면 완전수
	      // ex) 6 - > 1,2,3,6
	      // 1+2+3 = 6(자기 자신)
	      // Q : 1~1000까지 숫자 중 완전수인 숫자를 모두 출력하세요.
	      // step1. 6을 기준으로 해서 약수구하는 코드
	      // step2. 6을 제외한 약수의 총합 구하기
	      // step3. 약수의 총합과 6을 비교해서 동일하면 해당 정수 출력
	      // step4. step1~3코드를 1~1000까지 반복할 수 있도록 작성!
	      // 패턴 찾아 반복문작성!
	      for (int j = 1; j <= 1000; j++) {
	         int sum = 0;
	         for (int i = 1; i < j; i++) {
	            if (j % i == 0) {
	               // System.out.print(i+" ");
	               sum += i;
	            }
	         } // 안쪽 for문이 끝나는 지점(약수 찾아 누적)
	         if (sum == j) {
	            System.out.print(j + " ");
	         }
	      }
	}

}
