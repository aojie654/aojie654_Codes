package thread2;

//�����ʻ�
public class BankAccountSynMethod {
	// �����˺�
	private String bankNo;
	// �������
	private double balance;

	// ���췽��
	public BankAccountSynMethod(String bankNo, double balance) {
		this.bankNo = bankNo;
		this.balance = balance;
	}

	// getter/setter����
	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public synchronized void access(double money){
		String name = Thread.currentThread().getName();
		//���ȡǮ����Ǯ���������������ִ�У�
		if(money<0&&balance+money<0){//d+money
			System.out.println(name+"����ʧ�ܣ����㣡");
		}else{//���Բ���
			balance=balance+money;
			System.out.println(name+"�����ɹ���Ŀǰ�˻����Ϊ��"+balance);
		}
	}
}

