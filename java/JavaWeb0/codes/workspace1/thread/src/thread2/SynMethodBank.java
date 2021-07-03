package thread2;
//�߳� ����1 
public class SynMethodBank extends Thread{
	//�����ʻ��Ǳ���
	private BankAccountSynMethod account;
	
	private double money;
	
	public SynMethodBank(String name,BankAccountSynMethod account,double money){
		super(name);//���߳�������
		this.account=account;
		this.money=money;
	}
	
	
	//ȥ�Լ����˻���Ǯ����ȡǮ
	public void run(){
			this.account.access(money);
	}
	
	public static void main(String[] args) throws InterruptedException{
		//Bankid balance
		BankAccountSynMethod myAccount = new BankAccountSynMethod("60001002",5000); 
		SynMethodBank t1 = new SynMethodBank("T1",myAccount,-3000);
		SynMethodBank t2 = new SynMethodBank("T2",myAccount,-3000);
		SynMethodBank t3 = new SynMethodBank("T3",myAccount,1000);
		SynMethodBank t4 = new SynMethodBank("T4",myAccount,-2000);
		SynMethodBank t5 = new SynMethodBank("T5",myAccount,2000);
		
		//������
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.start();
		
	}
}
