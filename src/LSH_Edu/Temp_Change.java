package LSH_Edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Temp_Change {
	void temperatureChange() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����µ� : ");
		
		try {
			double Celsius = scan.nextDouble(); 
			double Fahrenheit  = (Celsius * 1.8) + 32; //�µ� ��ȯ���� : (���� * 1.8) + 32
			System.out.println("ȭ���µ� : " + Fahrenheit);
		}catch(InputMismatchException e) {
			System.out.println("wrong value");
			return;
		}
		finally {
			scan.close();
		}
	}
}
