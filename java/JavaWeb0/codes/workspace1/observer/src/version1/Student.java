package version1;
//Student����ǹ۲��ߡ�
public class Student {
	private String name;
	public Student(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//����״̬�ı�۲��ߵ���Ϊ��
	public void update(String newState){
		if(newState.equals("��ʦ����")){
			System.out.println("��ʦ���ڣ�"
		+this.name+"��ʼ���ֻ���");
		}
		if(newState.equals("��ʦ��")){
			System.out.println("��ʦ�ڣ�"
		+this.name+"�ú�ѧϰ��");
		}
	}
}
