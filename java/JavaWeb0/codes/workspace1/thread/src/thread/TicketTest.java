package thread;

//�˶���Ϊ�߳�1 ����1 Runnable
public class TicketTest implements Runnable{
	private int ticketNum=20;//200��Ʊ��ÿ��ƱƱ�ž���˳��ţ�

	@Override
	public void run() {
		String name=Thread.currentThread().getName();

		for(int i=0;i<100;i++){
			if(ticketNum>0){
				System.out.println(name+"��Ʊ��Ʊ�ţ�"+ticketNum);
				ticketNum = ticketNum -1;//Ʊ�����٣�
			}
		}
	}
	
	public static void main(String[] args){
		Thread ��ţ1 = new Thread(new TicketTest(),"��ţ1");
		Thread ��ţ2 = new Thread(new TicketTest(),"��ţ2");
		Thread ��ţ3 = new Thread(new TicketTest(),"��ţ3");
		��ţ1.start();
		��ţ2.start();
		��ţ3.start();
	}
	
	
	
	
}
