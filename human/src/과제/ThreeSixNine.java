package 과제;

public class ThreeSixNine {
//		[문제] 3,6,9 게임
//		- 1~100 사이의 정수를 반복하여 출력하면서, 해당 숫자가 3 또는 6 또는 9 인 경우
//		    해당 숫자 대신 그 개수만큼 "*" 을 출력하는 프로그램을 작성하시오.
//		  ex)  3   -> *
//		       36  -> **
//		       
//		[조건]
//		- 주어진 코드의 변수를 사용하여 코드를 완성하시오.
//		- 변수의 초기값을 변경해도 됩니다.
//
//		(실행결과)
//		1
//		2
//		*
//		4
//		5
//		*
	
	public static void main(String[] args) {
		
		// 1~100 사이의 정수를 반복
		for (int i = 1; i <= 100; i++) {
			int one = i % 10;					//일의자리
			int ten = i / 10;					//십의자리
			boolean one369 = (one == 3 || one == 6 || one == 9);		//일의자리가 369가 되는지
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);		//십의자리가 369가 되는지
			
			// 일의 자리, 십의 자리 모두 369
			if( one369 && ten369 ) {
				// --> **
				System.out.println("**");
			}
			// 그렇지 않고, 둘중의 하나만 369
			else if ( one369 || ten369 ) {
				// --> *
				System.out.println("*");
			}
			// 그렇지 않으면,
			else{
				// --> i(숫자) 출력
				System.out.println(i);
			}
			
			
		}
		
	}

}