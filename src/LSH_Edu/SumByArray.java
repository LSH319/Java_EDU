package LSH_Edu;

import java.util.Scanner;

public class SumByArray {
	void sum() {
		Scanner scan = new Scanner(System.in);
		
		int[] input;
		int sum=0;
		
		System.out.print("�Է��� ���� ���� : ");
		int length = scan.nextInt();
		input = new int[length];
		
		for(int i = 0;i < length;i++) {
			input[i] = scan.nextInt();
		}
		
		for(int i = 0;i < length; i++) {
			sum = sum + input[i];
		}
		System.out.print("�հ� : "+ sum);
		scan.close();
	}
}
