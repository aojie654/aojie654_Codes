package demo4;

public class Monkey extends Animal{
	private static String type="����";
	public Monkey(String name){
		super(name);
	}
	public Monkey(){
		super();//���ø���Ĺ��캯����
	}
	
	
	public void shout(){
		System.out.println("���Ǻ��ӣ�"+this.getSound());
	}//���󷽷���������ô�в�֪�����������У�
}
