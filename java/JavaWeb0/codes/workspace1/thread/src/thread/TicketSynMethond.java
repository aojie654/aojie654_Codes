package thread;

//�˶���Ϊ�߳�1 ����1 Runnable
public class TicketSynMethond implements Runnable{
	//int �Ȼ�������û������ synchronized(this.ticketNum) ����ģ�
	private Integer ticketNum=500;//200��Ʊ��ÿ��ƱƱ�ž���˳��ţ�
	private String str = "abc";//String str��������
	private Integer tNum=500;//tNum������
	private TicketNum ticketNumber;//������
	//����tNum��final�ģ����ܸı䣬һ��ͳ��µĶ����ˣ�����������
	public TicketSynMethond (TicketNum tnum){
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
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		this.buy(name);//����ͬ��������ע��ͬ�������Ķ�����ֻ����this����
		
	}
	
	public static void main(String[] args){
		TicketNum tn1 =new TicketNum();
		TicketNum tn2 =new TicketNum();
		TicketNum tn3 =new TicketNum();
		TicketSynMethond tm=new TicketSynMethond(tn1);
		Thread ��ţ1 = new Thread(tm,"��ţ1");
		Thread ��ţ2 = new Thread(tm,"��ţ2");
		Thread ��ţ3 = new Thread(tm,"��ţ3");
		��ţ1.start();
		��ţ2.start();
		��ţ3.start();
	}
	
	
	
	
}
