package demo3;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //��һ���Ķ��������ԷŽ�ȥ��Set����ж�
		Set set = new HashSet();
		A a1 = new A();
		A a2 = new A();
		set.add(a1);
		set.add(a2);// ��equals����true��hashcode ���˵��ͬһ������
		//����set���ϣ������м���A����a1,a2?
		B b1 = new B();
		B b2 = new B();//hashcode��һ���Ϳ��ԷŽ�ȥ����ȻequalsΪtrue
		
		set.add(b1);
		set.add(b2);
		
		C c1 = new C();
		C c2 = new C();//hashcodeһ��,equalsΪfalse ,Ҳ���Է���set��
		//���hashCodeһ���������˳�ͻ��
		//��java ʹ�������¶���������ӣ���������������Ӱ�����ܡ�
		set.add(c1);
		set.add(c2);
		for(Object o:set){
			System.out.println(o);
		}
	}

}
class A{
	//����hashCode�������˷���������ŵ�λ�ã�
	public int hashCode(){
		return 1002;
	}
	//����equals������
	public boolean equals(Object obj){
		return true;
	}
}

class B{
	//������hashCode������
	//����equals������
	public boolean equals(Object obj){
		return true;
	}
}
class C{
	    //����hashCode�������˷���������ŵ�λ�ã�
		public int hashCode(){
			return 1002;
		}
		//����equals������
		public boolean equals(Object obj){
			return false;
		}
}
