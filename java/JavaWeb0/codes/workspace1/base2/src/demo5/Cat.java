package demo5;

public class Cat extends Animal{
	//���캯������Ա�����������Ŀɼ��ȱ����ƣ�
	private static String type="è";
	public Cat(String name){
		super(name,"��~");
	}
	public Cat(){
		super();//���ø���Ĺ��캯����
		
	}
	
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shoutStr.append(this.getSound());
		}
		System.out.println("��Һã�����һֻ"+Cat.type+"�ҽ�"+this.getName()+"��"+shoutStr);
	}
}

