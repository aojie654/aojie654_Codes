package demo2;

public class Cat {
	//���캯������Ա�����������Ŀɼ��ȱ����ƣ�
	 String name;
	private int shoutNum;
	public Cat(String name){
		this.name=name;
		this.shoutNum=3;
	}
	public Cat(){
		name="Сè";
		this.shoutNum=3;
	}
	
	public void setShoutNum(int shoutNum) {
		this.shoutNum = shoutNum;
	}
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<shoutNum;i++){
			shoutStr.append("��~");
		}
		System.out.println("��Һã�����һֻè,"+"�ҽ�"+this.name+"��"+shoutStr);
	}
	
	public static void main(String[] args){
		Cat cat1 = new Cat();
		cat1.shout();
		Cat cat2 = new Cat("����");
		cat2.shout();
		Cat cat3 = new Cat("��è");
		cat3.setShoutNum(9);
		cat3.shout();
	}

}

