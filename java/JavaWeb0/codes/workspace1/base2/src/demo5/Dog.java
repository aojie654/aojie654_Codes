package demo5;

public class Dog  extends Animal{
	//���캯������Ա�����������Ŀɼ��ȱ����ƣ�
	private static String type="��";
	public Dog(String name){
		super(name,"��~");
	}
	public Dog(){
		super();//���ø���Ĺ��캯����
	}
	
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shoutStr.append(this.getSound());
		}
		System.out.println("��Һã�����һֻ"+Dog.type+"�ҽ�"+this.getName()+"��"+shoutStr);
	}
}

