package LSH_Edu;

import java.util.Scanner;

public class Main {
  
  
  public static void main(String[] args) {
	int menu = 0;
	Temp_Change temp = new Temp_Change();
	Sum_1to100 sum = new Sum_1to100();
	Scanner scan = new Scanner(System.in);
	Times_Table times_t = new Times_Table();
	Print_Star print_s = new Print_Star();
	Cal_Score cal_s = new Cal_Score();
	SumAndAver sAnda = new SumAndAver();
	SumAndAverByArray sAndaBa = new SumAndAverByArray();
	Trans_UpperLower trans_ul = new Trans_UpperLower();
	Caesar_Cipher caesar = new Caesar_Cipher();
	SumByArray sBya = new SumByArray();
	Calculator calc = new Calculator();
	
	System.out.println("1. �µ� ��ȯ\n2. 1���� 100���� ��\n3. ������ ���\n4. ��ǥ ���\n5. ���� ���\n6. �հ�� ���\n7. �հ�� ���2\n8. ��ҹ��� ����/n9. ī�̻縣 ��ȯ\n10. �迭�� ���� ����\n11. ��Ģ����");
	System.out.print("�޴����� : ");
	menu = scan.nextInt();
	
	if (menu == 1) temp.temp_change();
	else if (menu == 2) sum.sum();
	else if (menu == 3) times_t.print_All();
	else if (menu == 4) print_s.print_All();
	else if (menu == 5) cal_s.cal_Score();
	else if (menu == 5) cal_s.cal_Score();
	else if (menu == 6) sAnda.sum_Aver();
	else if (menu == 7) sAndaBa.sumAndaver();
	else if (menu == 8) trans_ul.trans_UpperLower();
	else if (menu == 9) caesar.trans();
	else if (menu == 10) sBya.sum();
	else if (menu == 11) calc.calculator();
  }
}
