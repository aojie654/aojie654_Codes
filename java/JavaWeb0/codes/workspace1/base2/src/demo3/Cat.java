package demo3;

public class Cat extends Animal{
	//���캯������Ա�����������Ŀɼ��ȱ����ƣ�
	private static String type;
	public Cat(String name){
		super(name,"��~","è");
	}
	public Cat(){
		super();//���ø���Ĺ��캯����
	}
	
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shoutStr.append(this.getSound());
		}
		System.out.println("��Һã�����һֻ"+this.type+"�ҽ�"+this.getName()+"��"+shoutStr);
	}
}

