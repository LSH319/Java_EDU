package LSH_Edu;

import java.util.Scanner;

public class Print_Star {
	void print_All() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ǥ ���� �Է� : ");
		int num = scan.nextInt();
		if(num <= 0 ) {
			System.out.print("Wrong value");
			return;
		}
		for(int i = 0;i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
