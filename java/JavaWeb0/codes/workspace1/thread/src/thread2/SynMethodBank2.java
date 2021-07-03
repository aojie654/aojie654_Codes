package thread2;
//�߳� ����1 
public class SynMethodBank2 extends Thread{
	//�����ʻ��Ǳ���
	private BankAccount account;
	
	private double money;
	
	public SynMethodBank2(String name,BankAccount account,double money){
		super(name);//���߳�������
		this.account=account;
		this.money=money;
	}
	
	public synchronized void access(double money){
		System.out.println(this.getName()+" come in");
		double d = this.account.getBalance();//�õ��ʻ����
		//���ȡǮ����Ǯ���������������ִ�У�
		if(money<0&&d+money<0){
			System.out.println(this.getName()+"����ʧ�ܣ����㣡");
		}else{//���Բ���
			d=d+money;
			System.out.println(this.getName()+"�����ɹ���Ŀǰ�˻����Ϊ��"+d);
			this.account.setBalance(d);//������
		}
	}
	//ȥ�Լ����˻���Ǯ����ȡǮ
	public void run(){
			this.access(money);
	}
	
	public static void main(String[] args) throws InterruptedException{
		//Bankid balance
		BankAccount myAccount = new BankAccount("60001002",5000); 
		SynMethodBank2 t1 = new SynMethodBank2("T1",myAccount,-3000);
		SynMethodBank2 t2 = new SynMethodBank2("T2",myAccount,-3000);
		SynMethodBank2 t3 = new SynMethodBank2("T3",myAccount,1000);
		SynMethodBank2 t4 = new SynMethodBank2("T4",myAccount,-2000);
		SynMethodBank2 t5 = new SynMethodBank2("T5",myAccount,2000);
		
		//������
		//�������
		
		
	}
}
