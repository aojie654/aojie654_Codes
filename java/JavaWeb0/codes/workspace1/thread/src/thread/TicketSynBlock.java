package thread;

//�˶���Ϊ�߳�1 ����1 Runnable
public class TicketSynBlock implements Runnable{
	private Integer ticketNum=200;//200��Ʊ��ÿ��ƱƱ�ž���˳��ţ�
	//Integer ��final�ġ�
	//synchronized()Բ������ֻ�ܷŶ���
	//java��ÿ��������һ�Ѷ�������int num��//�������Ͷ���û������ 
	//String str
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		//()Բ�����ж�������ָ������Ϳ��ԣ�
		synchronized(this.ticketNum){//ϣ������Ĵ���ͬһʱ��ֻ����һ���̷߳��ʣ������
			//ͨ����this����Ķ�����ʵ�ֻ��⣡
			System.out.println(name+" come in");
			for(int i=0;i<100;i++){
				if(ticketNum>0){
					System.out.println(name+"��Ʊ��Ʊ�ţ�"+ticketNum);
					ticketNum = ticketNum -1;//Ʊ�����٣�
				}				
			}
		}
	}
	
	public static void main(String[] args){
		TicketSynBlock o1 = new TicketSynBlock();
		//������ţ����o1�������
		Thread ��ţ1 = new Thread(o1,"��ţ1");
		Thread ��ţ2 = new Thread(o1,"��ţ2");
		Thread ��ţ3 = new Thread(o1,"��ţ3");
		��ţ1.start();
		��ţ2.start();
		��ţ3.start();
	}
	
}
