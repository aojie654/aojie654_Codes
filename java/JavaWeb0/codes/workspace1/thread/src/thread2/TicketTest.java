package thread2;

//TicketTest�߳̽��й�Ʊ��
public class TicketTest implements Runnable{

	private int ticketNum =5;//����Ʊ����
	
	//���Դ��룡
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new TicketTest());
		t1.setName("��ţ1");
		Thread t2 = new Thread(new TicketTest());
		t2.setName("��ţ2");
		Thread t3 = new Thread(new TicketTest());
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
		for(int i=0;i<100;i++){
			
			if(ticketNum>0){
				//����һ�ᡣ 
				ticketNum--;//��ƱƱ�����٣�
				System.out.println(name+"��Ʊ��" +ticketNum);
			}
			
		}
	}

}
