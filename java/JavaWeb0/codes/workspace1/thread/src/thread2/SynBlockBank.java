package thread2;
//�߳� ����1 
public class SynBlockBank extends Thread{
	//�����ʻ��Ǳ���
	private BankAccount account;
	
	private double money;
	
	public SynBlockBank(String name,BankAccount account,double money){
		super(name);//���߳�������
		this.account=account;
		this.money=money;
	}
	//ȥ�Լ����˻���Ǯ����ȡǮ
	public void run(){
		synchronized (this.account){//��account����ͬ����
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
	}
	
	public static void main(String[] args) throws InterruptedException{
		//Bankid balance
		BankAccount myAccount = new BankAccount("60001002",5000); 
		SynBlockBank t1 = new SynBlockBank("T1",myAccount,-3000);
		SynBlockBank t2 = new SynBlockBank("T2",myAccount,-3000);
		SynBlockBank t3 = new SynBlockBank("T3",myAccount,1000);
		SynBlockBank t4 = new SynBlockBank("T4",myAccount,-2000);
		SynBlockBank t5 = new SynBlockBank("T5",myAccount,2000);
		
		//������
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.start();

		
		
	}
}
