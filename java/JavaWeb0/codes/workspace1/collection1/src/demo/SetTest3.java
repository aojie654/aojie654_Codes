package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {
	//��������ֻ�ܷ�����ʵ�����󡣲�ָ����Ĭ��Object ���ܷŻ������͡�int 
	private static Set set;
	public static void main(String[] args) {
		//���岢��ʼ��Collection �����
		set =new HashSet();
		//Set �ص��ǲ��ܷ��ظ��Ķ��������ܱ���˳��
		//���ˮ��
		set.add("����");//�Զ�װ����̡�
		set.add(new String("ƻ��"));
		set.add("����");
		set.add("������");
		set.add("����");
		set.add("����");
		set.add("����");//Set�в�������ͬ�Ķ�������������
		//coll.add(12);//�Զ�װ�䡣int->Integer
		//���˵���Զ�ĵط���
		set=move("����");
		//ȡ������ʹ�õ�����ȡ������һ��ȡ�����ķ���
		Iterator  iterator =set.iterator();
		while(iterator.hasNext()){//һ��һ��������
			String str = (String)iterator.next();
			System.out.println(str);
		}
		//ƻ�� -������ -������ -������ -������ -��������
		//���ݽ����֪��Set �ص��ǲ��ܷ��ظ��Ķ��������ܱ���˳��
		//�˷�������foreachѭ��������setʱûָ�������Ǿ���Ϊ��Object
		for (Object str : set) {
			System.out.println((String)str);
		}
	}
	public static Set move(String difang){
		System.out.println("�����Ӱᵽ��"+difang);
		return set;
	}

}
