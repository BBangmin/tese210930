package Test2;

import java.util.Scanner;

class Phone{
	String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}
public class PhoneBook {
	public static void main(String[] args) {
		boolean exit = false;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("�ο���>>");
			int num = scanner.nextInt();
			Phone[] p = new Phone[num];
				
			for (int i = 0; i < p.length; i++) {
				System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
				String name = scanner.next();
				String tel = scanner.next();
				p[i] = new Phone(name, tel);
			}
			System.out.println("����Ǿ����ϴ�...");
			
			for (int j = 0; true; j++) {
				System.out.print("�˻��� �̸�>>");
				String search = scanner.next();
						
				boolean test = true;
	
				for (int i = 0; i < p.length; i++) {
					if (search.equals(p[i].name)) {
						System.out.println(p[i].name +"�� ��ȣ�� "+p[i].tel);
						test = true;
						break;			
					}else{
						test = false;
					}
				}					
				if(search.equals("�׸�")) {
					System.out.println("�����մϴ�...");
					exit = true;
					break;		
				}else if (!test) {
					System.out.println(search+" �� �����ϴ�.");						
				}
			}
			scanner.close();
		}while (!exit);
	}
}
