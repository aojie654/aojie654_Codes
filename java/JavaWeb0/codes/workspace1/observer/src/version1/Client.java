package version1;

public class Client {
	public static void main(String[] args){
		Moniter Ҧ�� =new Moniter();
		
		Student stu1 = new Student("����");
		Student stu2 = new Student("Ҧ��");
		
		Ҧ��.attach(stu1);//�󶨣�
		Ҧ��.attach(stu2);//�󶨣�
		
		Ҧ��.inform("��ʦ����");
		Ҧ��.dettach(stu1);//���
		Ҧ��.inform("��ʦ��");	
	}
}
