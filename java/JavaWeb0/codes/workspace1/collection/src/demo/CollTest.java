package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//HashSet
//���һЩ��ϲ���Ķ�����
//����Щ�������б�����
public class CollTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add(0, "��մ�");
		list.add(1, "��ʷ����ϸ��");
		list.add(2, "Java�߼����");
		list.add(3, "����Ұʷ");
		list.add(3, "����ɾ�");//����Ч����
		list.set(3, "abc");//�滻Ч����
		
		//ѭ����ʽ2
		for(int i=0;i<list.size();i++){
			String str=list.get(i);	
			System.out.println(str);
		}
		
		Collection<String> list2 = new ArrayList<>();
		
		list2.add("��մ�");
		list2.add("��ʷ����ϸ��");
		list2.add("Java�߼����");
		list2.add("����ɾ�");
		list2.add("����Ұʷ");
		
		//2 ��α�����
		Iterator<String> iterator =list2.iterator();
		
		//ѭ����ʽ1
		while(iterator.hasNext()){
			String obj=iterator.next();
			System.out.println(obj);
		}
		
		//ѭ����ʽ3 foreach
		for(String str:list){
			System.out.println(str);
		}
		//<>���ͣ� ���԰������Ƿ��ó��ּ����з��벻һ�µ������1.5�����˷��ͣ�
		//��������ֻ�ܷ������
		Set<String> set = new HashSet<>();
		set.add("��ݮ");//�Զ�װ�䣡��Ӧ �Զ����䣡 
		set.add(new String("��ݮ"));//ϵͳ�Զ��������͡���ݮ���ַ���װ���Stringʵ������
		set.add("��ݮ");
		set.add("�㽶");
		set.add("ƻ��");
		
		
		
		//ѭ����ʽ4 foreach
		for(String str:set){
			System.out.println(str);
		}
		
		//2 ��α�����
		Iterator iterator2 =set.iterator();
		
		//ѭ����ʽ1
		while(iterator2.hasNext()){
			String obj=(String)iterator2.next();
			System.out.println(obj);
		}
		
	}

}
