package LSH_Edu;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("�����µ� : ");
	double temp = scan.nextDouble(); 
	Double Fahr = (temp * 1.8) + 32; //�µ� ��ȯ���� : (���� * 1.8) + 32
	
	System.out.println("ȭ���µ� : " + Fahr);
  }
}
