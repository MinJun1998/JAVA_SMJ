package Day02;

import java.util.Scanner;

public class Ex20_Star1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// n쥴이 나오도록 반복
		// n번째 줄일 때, *이 n번 출력되도록 반복
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				// i : 1 , j : 1
				// i : 2 , j : 1 2
				// i : 3 , j : 1 2 3
				// i : 4 , j : 1 2 3 4
				// i : 5 , j : 1 2 3 4 5
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
