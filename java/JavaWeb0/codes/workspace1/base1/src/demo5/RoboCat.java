package demo5;

public class RoboCat extends Cat implements ISon{

	public RoboCat (){
		super("����è");
	}
	
	@Override
	public void changeThing() {
	
		// TODO Auto-generated method stub
		System.out.println("���пռ�ڴ������Ա�����ֶ�����"+IChange.name);
	}

}
