package decorator;
//����Ҫ��show��������װ�Σ�
public class Model implements Show{
	private String name;
	public Model(String name){
		this.name = name;
	}
	@Override
	public void show() {//�˷���Ϊ�Ѿ��е���д�õķ�����������Ҫ�Դ˷�������װ�Σ�
		// TODO Auto-generated method stub
		System.out.println(name+ " ,ģ����T̨�����㣡�ǳ�ʱ�У�");
	}
	
}
