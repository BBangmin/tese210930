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
			System.out.print("인원수>>");
			int num = scanner.nextInt();
			Phone[] p = new Phone[num];
				
			for (int i = 0; i < p.length; i++) {
				System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
				String name = scanner.next();
				String tel = scanner.next();
				p[i] = new Phone(name, tel);
			}
			System.out.println("저장되었습니다...");
			
			for (int j = 0; true; j++) {
				System.out.print("검색할 이름>>");
				String search = scanner.next();
						
				boolean test = true;
	
				for (int i = 0; i < p.length; i++) {
					if (search.equals(p[i].name)) {
						System.out.println(p[i].name +"의 번호는 "+p[i].tel);
						test = true;
						break;			
					}else{
						test = false;
					}
				}					
				if(search.equals("그만")) {
					System.out.println("종료합니다...");
					exit = true;
					break;		
				}else if (!test) {
					System.out.println(search+" 이 없습니다.");						
				}
			}
			scanner.close();
		}while (!exit);
	}
}
