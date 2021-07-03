package thread2;
//�߳� ����1 
public class NoSynBank extends Thread{
	//�����ʻ��Ǳ���
	private BankAccount account;
	
	private double money;
	
	public NoSynBank(String name,BankAccount account,double money){
		super(name);//���߳�������
		this.account=account;
		this.money=money;
	}
	//ȥ�Լ����˻���Ǯ����ȡǮ
	public void run(){
		double d = this.account.getBalance();//�õ��ʻ����
		//���ȡǮ����Ǯ���������������ִ�У�
		if(money<0&&d-money<0){
			System.out.println(this.getName()+"����ʧ�ܣ����㣡");
		}else{//���Բ���
			d=d+money;
			System.out.println(this.getName()+"�����ɹ���Ŀǰ�˻����Ϊ��"+d);
			this.account.setBalance(d);//������
		}
	}
	
	public static void main(String[] args){
		//Bankid balance
		BankAccount myAccount = new BankAccount("60001002",5000); 
		NoSynBank t1 = new NoSynBank("T1",myAccount,-3000);
		NoSynBank t2 = new NoSynBank("T2",myAccount,-3000);
		NoSynBank t3 = new NoSynBank("T3",myAccount,1000);
		NoSynBank t4 = new NoSynBank("T4",myAccount,-2000);
		NoSynBank t5 = new NoSynBank("T5",myAccount,2000);
		
		//������
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
