package LSH_Edu;

import java.util.Scanner;

public class SumByArray {
	void sum() {
		Scanner scan = new Scanner(System.in);
		
		int[] input;
		int sum=0;
		
		System.out.print("�Է��� ���� ���� : ");
		int num = scan.nextInt();
		input = new int[num];
		
		for(int i = 0;i < num;i++) {
			input[i] = scan.nextInt();
		}
		
		for(int i = 0;i < num; i++) {
			sum = sum + input[i];
		}
		System.out.print("�հ� : "+ sum);
		scan.close();
	}
}
