package LSH_Edu;

import java.util.Arrays;

class BankAccount{
	String Name;
	String Account;
	String[][] Log = {{"����","0","0"}};
	int balance = 0;
	
	public void deposit(int amount) {
		this.balance = this.balance + amount;
		inputlog("�Ա�",amount);
	}
	public void withdraw(int amount) {
		if(this.balance < amount) {
			System.out.println("��ݾ��� �ܾ��� �ѱ� �� �����ϴ�.");
		}
		else {
			this.balance = this.balance - amount;
			inputlog("���",amount);
		}
	}
	public void inputlog(String input,int amount) {
		String[][] newLog = Arrays.copyOf(this.Log, (this.Log.length) + 1);
		newLog[this.Log.length][0] = input;
		newLog[this.Log.length][1] = Integer.toString(amount);
		newLog[this.Log.length][2] = Integer.toString(this.balance);
		this.Log = newLog.clone();
	}
}

public class BankManager {

}
