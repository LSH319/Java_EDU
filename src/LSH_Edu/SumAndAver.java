package LSH_Edu;

import java.util.Scanner;

public class SumAndAver {
	void scoreSumAndAverage() {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		double aver;
		
		System.out.print("10���� ���� �Է� : ");
		
		scan = new Scanner(scan.next()).useDelimiter("\\s*,\\s*");
		for(int i =0; i<10; i++) {
			int score = scan.nextInt();
			sum = sum + score;
		}
		
		aver = (double)sum/10;
		System.out.print("�հ� : "+sum+"\n��� : "+aver);
		scan.close();
	}
}
