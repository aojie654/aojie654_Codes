package demo3;
//��Ϣ���������칤����
public class SendFactory {
	
	public static Sender produceSms(){
		return new SmsSender();
	}
	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	//���Թ���������
	public static void main(String[] args){
		//ʵ��ʹ���У���̬�ķ�ʽ��ã���
		Sender mailSender=SendFactory.produceMail();
		mailSender.send();
		Sender smsSender=SendFactory.produceSms();
		smsSender.send();
	}
}
