package Test2;

public class PMS_test {
	public static void main(String[] args) {
		int sum=0;
		int[][] array = new int[3][4];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				array[i][j] = (int) (Math.random()*10);
				System.out.print(array[i][j]+"   ");
				sum += array[i][j];
			}
			System.out.println();
		}
		System.out.println("гую╨ "+sum);
	}
}
