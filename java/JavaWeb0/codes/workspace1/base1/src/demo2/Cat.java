package demo2;

import demo1.Test1;

public class Cat {//���п����ж�����캯����
	//��Ա����
	private String name;
	private int shoutNum;
	public void setShoutNum(int shoutNum) {
		this.shoutNum = shoutNum;
	}
	//�޲ι��캯����
	protected  Cat(String name){
		this.name=name;//����name ��name����һ��������
		this.shoutNum=3;
	}
	//Ĭ�ϵ�ϵͳ���ÿ����һ���޲ε������ݵĹ��캯���������д�˹��캯����ϵͳ�ľ�ȡ���ˣ�
	public  Cat(){
		this.name="Сè";
		this.shoutNum=3;
	}
	
	//non static��������ʵ����� Test1��Ķ������t1
	 void shout(){
		//String ���ɱ��ַ���
		//StringBuffer���ǿɱ��ַ���
		StringBuffer shout=new StringBuffer("");
		for(int i=0;i<shoutNum;i++){
			shout.append("��~");
		}
		System.out.println("����һֻСè��"+"�ҽ�"+this.name+","+shout);
		
	}
	public static void main(String[] args){
		      //t1�Ƕ���
		Cat cat= new Cat();
		cat.shout();
		
		Cat cat2= new Cat("kitty");
		cat2.shout();
		cat2.setShoutNum(9);
		cat2.shout();
	}
}
