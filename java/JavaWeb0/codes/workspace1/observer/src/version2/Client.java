package version2;
//��·����ҵ  �������ݺ�·�� ͣ�������·������
public class Client {
	public static void main(String[] args){
		Monitor  mon = new Monitor();
		
		Observer o1 = new GameStudent("����");
		Observer o2 = new PhoneStudent("Ҧ��");
		mon.attach(o1);
		mon.attach(o2);
		mon.change("��ʦ��");
		//mon.dettach(o1);
		mon.change("��ʦ����");
	}
}
