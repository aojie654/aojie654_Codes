package demo3;

//�����ظ��� Dog ��Cat�ظ�̫���ˣ�
public class Dog extends Animal{//���п����ж�����캯����
	
	//�޲ι��캯����
	protected  Dog(String name){
		super(name);
	}
	//Ĭ�ϵ�ϵͳ���ÿ����һ���޲ε������ݵĹ��캯���������д�˹��캯����ϵͳ�ľ�ȡ���ˣ�
	public  Dog(){
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
		System.out.println("����һֻС����"+"�ҽ�"+this.getName()+","+shout);	
	}
	
}
