package LSH_Edu;

import java.util.Scanner;

public class Main {
  
  
  public static void main(String[] args) {
	int menu = 0;
	Temp_Change temp = new Temp_Change();
	Sum_1to100 sum = new Sum_1to100();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("1. �µ� ��ȯ\n2. 1���� 100���� ��");
	System.out.print("�޴����� : ");
	menu = scan.nextInt();
	if (menu == 1) temp.temp_change();
	else if (menu == 2) sum.sum();
  }
}
