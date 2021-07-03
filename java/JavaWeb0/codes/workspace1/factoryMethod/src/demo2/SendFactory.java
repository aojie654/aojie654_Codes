package demo2;
//��Ϣ���������칤����
public class SendFactory {

	public Sender produceSms(){
		return new SmsSender();
	}
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	//���Թ���������
	public static void main(String[] args){
		SendFactory factory = new SendFactory();
		Sender mailSender=factory.produceMail();
		mailSender.send();
		Sender smsSender=factory.produceSms();
		smsSender.send();
	}
}
