package Test2;

import java.util.Scanner;

public class PMS_Test2 {

	public static void main(String[] args) {
		
		String password = "myongji60"; //암호
		String input; //입력값
		int trynumber = 0; //암호 입력 횟수
		
		
		Scanner scanner = new Scanner(System.in);
		
		while (trynumber < 3 ) {
			
		System.out.println("암호를 입력하세요: ");
		input = scanner.next();
		
		if (!input.equals(password)) {
			System.out.println("암호가 틀립니다");
			trynumber = trynumber + 1;
			
		} else {
			System.out.println("환영합니다");
			break;
		}
		
		if (trynumber == 3) {
			System.out.println("접속을 거부합니다");
			break;
		}
	}
		scanner.close();
	}

}
