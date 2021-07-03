package thread2;

//TicketTest�߳̽��й�Ʊ��
public class TicketSynTest1 implements Runnable{
	//�ǻ���������ֻҪ�Ƕ���Ϳ���ʹ��ͬ���ؼ���
	private Num ticketNum =null;//����Ʊ����
	
	//���Դ��룡
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num num =new Num(new Integer(200));
		//ע��1
		TicketSynTest1 huangniu1 = new TicketSynTest1();
		huangniu1.setTicketNum(num);
		Thread t1 = new Thread(huangniu1);
		t1.setName("��ţ1");
		TicketSynTest1 huangniu2 = new TicketSynTest1();
		huangniu2.setTicketNum(num);
		Thread t2 = new Thread(huangniu2);
		t2.setName("��ţ2");
		TicketSynTest1 huangniu3 = new TicketSynTest1();
		huangniu3.setTicketNum(num);
		Thread t3 = new Thread(huangniu3);
		t3.setName("��ţ3");
		t1.start();
		t2.start();
		t3.start();
	}
	
	//��Ʊ������
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		//��ţ�����Ʊ����һ�ٴΣ���ȡ������Ʊ���򵽣�
		for(int i=0;i<50;i++){
			//ע��2 ��thisͬ�����ǶԱ�TicketSynTest1��ͬһ��ʵ������ͬ��
			synchronized (this.ticketNum){//ͬ������飡��thisͬ�����ǶԱ�TicketSynTest1��
				if(ticketNum.num>0){
					//����һ�ᡣ 
					ticketNum.num--;//��ƱƱ�����٣�
					System.out.println(name+"��Ʊ��" +ticketNum.num);
				}
			}
		}
	}

	public Num getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(Num ticketNum) {
		this.ticketNum = ticketNum;
	}

}
