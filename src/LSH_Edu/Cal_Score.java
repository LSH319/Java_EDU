package LSH_Edu;

import java.util.Scanner;

public class Cal_Score {
	void calculationScore() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		
		System.out.print("���� : ");
		if(score >= 90) System.out.print("A");
		else if(score >= 80) System.out.print("B");
		else if(score >= 70) System.out.print("C");
		else if(score >= 60) System.out.print("D");
		else System.out.print("F");
		scan.close();
	}
}
