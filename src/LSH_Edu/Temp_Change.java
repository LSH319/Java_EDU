package LSH_Edu;

import java.util.Scanner;

public class Temp_Change {
	void temp_change() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����µ� : ");
		double temp = scan.nextDouble(); 
		Double Fahr = (temp * 1.8) + 32; //�µ� ��ȯ���� : (���� * 1.8) + 32
		
		System.out.println("ȭ���µ� : " + Fahr);
	}
}
