package thread;

//�˶���Ϊ�߳�1 ����1 Runnable  ���߳�ͨѶ��wait notify ����ͬ��������У�
public class TicketSynBlock2 implements Runnable{
	//int �Ȼ�������û������ synchronized(this.ticketNum) ����ģ�
	private Integer ticketNum=500;//200��Ʊ��ÿ��ƱƱ�ž���˳��ţ�
	private String str = "abc";//String str��������  ��������Ӧ�ַ������е�ͬһ���ַ���
	private Integer tNum=500;//tNum������
	private TicketNum ticketNumber;//������
	//����tNum��final�ģ����ܸı䣬һ��ͳ��µĶ����ˣ�����������
	public TicketSynBlock2 (TicketNum tnum ,Integer num){
		this.ticketNumber =tnum;
		this.tNum = num;
	}
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		//()Բ�����ж�������ָ������Ϳ��ԣ�
		synchronized(this.ticketNumber){//����Ĵ���ͬһʱ��ֻ����һ���̷߳��ʣ�
			System.out.println(name+" come in");
			for(int i=0;i<100;i++){
				if(ticketNumber.ticketNum>0){
					System.out.println(name+"��Ʊ��Ʊ�ţ�"+ticketNumber.ticketNum);
					ticketNumber.ticketNum = ticketNumber.ticketNum -1;//Ʊ�����٣�
				}
				
			}
		}
	}
	
	public static void main(String[] args){
		TicketNum tn1 =new TicketNum();
		TicketNum tn2 =new TicketNum();
		TicketNum tn3 =new TicketNum();
		Integer num0= 100;
		Thread ��ţ1 = new Thread(new TicketSynBlock2(tn1,num0),"��ţ1");
		Thread ��ţ2 = new Thread(new TicketSynBlock2(tn1,num0),"��ţ2");
		Thread ��ţ3 = new Thread(new TicketSynBlock2(tn1,num0),"��ţ3");
		��ţ1.start();
		��ţ2.start();
		��ţ3.start();
	}

}
