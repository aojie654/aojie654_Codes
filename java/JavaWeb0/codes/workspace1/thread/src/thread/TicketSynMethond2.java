package thread;

//�˶���Ϊ�߳�1 ����1 Runnable
public class TicketSynMethond2 extends Thread{
	//int �Ȼ�������û������ synchronized(this.ticketNum) ����ģ�
	private Integer ticketNum=500;//200��Ʊ��ÿ��ƱƱ�ž���˳��ţ�
	private String str = "abc";//String str��������
	private Integer tNum=500;//tNum������
	private TicketNum ticketNumber;//������
	//����tNum��final�ģ����ܸı䣬һ��ͳ��µĶ����ˣ�����������
	public TicketSynMethond2 (TicketNum tnum){
		this.ticketNumber =tnum;
	}
	//synchronizedͬ�����������ؼ��ַŵ�public ��void �м䣡
	public synchronized void buy(String name){
		System.out.println(name+" come in");
		for(int i=0;i<100;i++){
			if(ticketNumber.ticketNum>0){
				System.out.println(name+"��Ʊ��Ʊ�ţ�"+ticketNumber.ticketNum);
				ticketNumber.ticketNum = ticketNumber.ticketNum -1;//Ʊ�����٣�
				if(i%10==0){
					try {
						Thread.sleep(1000);//��ʹ˯�ţ�Կ�׻����ţ�
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public void run() {
		String name=Thread.currentThread().getName();
		this.buy(name);//����ͬ��������ע��ͬ�������Ķ�����ֻ����this����
	}
	
	public static void main(String[] args){
		TicketNum tn1 =new TicketNum();
		TicketNum tn2 =new TicketNum();
		TicketNum tn3 =new TicketNum();
		Thread tm1=new TicketSynMethond2(tn1);
		Thread tm2=new TicketSynMethond2(tn1);
		Thread tm3=new TicketSynMethond2(tn1);

		//��֣������ã�3���߳���Ʊ��
		Thread t1 = new Thread(tm1,"�߳�1");
		Thread t2 = new Thread(tm1,"�߳�2");
		Thread t3 = new Thread(tm1,"�߳�3");
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	
	
}
