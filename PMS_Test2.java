package Test2;

import java.util.Scanner;

public class PMS_Test2 {

	public static void main(String[] args) {
		
		String password = "myongji60"; //��ȣ
		String input; //�Է°�
		int trynumber = 0; //��ȣ �Է� Ƚ��
		
		
		Scanner scanner = new Scanner(System.in);
		
		while (trynumber < 3 ) {
			
		System.out.println("��ȣ�� �Է��ϼ���: ");
		input = scanner.next();
		
		if (!input.equals(password)) {
			System.out.println("��ȣ�� Ʋ���ϴ�");
			trynumber = trynumber + 1;
			
		} else {
			System.out.println("ȯ���մϴ�");
			break;
		}
		
		if (trynumber == 3) {
			System.out.println("������ �ź��մϴ�");
			break;
		}
	}
		scanner.close();
	}

}
