package demo3;


public class Cat extends Animal{//���п����ж�����캯����

	//�޲ι��캯����
	protected  Cat(String name){
		super(name);//���๹�캯����
		
	}
	//Ĭ�ϵ�ϵͳ���ÿ����һ���޲ε������ݵĹ��캯���������д�˹��캯����ϵͳ�ľ�ȡ���ˣ�
	public  Cat(){
		super();
	}
	@Override
	public void shout() {
		//String ���ɱ��ַ���
		//StringBuffer���ǿɱ��ַ���
		StringBuffer shout=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shout.append("��~");
		}
		System.out.println("����һֻСè��"+"�ҽ�"+this.getName()+","+shout);	
	}
	
 
}
