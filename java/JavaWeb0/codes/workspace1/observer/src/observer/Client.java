package observer;

public class Client {
	public static void main(String[] args){
		Secretary mi =new Secretary();
		Observer o1 = new Observer("С��");
		Observer o2 = new Observer("С��");
		mi.attach(o1);//�󶨣�
		mi.attach(o2);
		mi.setState("�ϰ岻��");
		mi.nodify();//֪ͨ���
		mi.setState("�ϰ�����ˣ�");
		mi.nodify();//֪ͨ���
	}
}
