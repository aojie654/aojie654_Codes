package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	//��������ֻ�ܷ�����ʵ�����󡣲��ܷŻ������͡�int 
	private static List<String> list;
	public static void main(String[] args) {
		//���岢��ʼ��List �����
		//ʹ�÷��ͣ������list�������Ҳֻ�ܷ�Stringʵ������ֹ��Ӭ���룡
		list =new ArrayList<String>();//��̬���鼯�ϡ����������顣
		//���ˮ�� ����ķ�ʽ��ӡ� list[0]="����";
	
		list.add(0, "����");
		list.add(1, "ƻ��");
		list.add(2, "�㽶");
		list.add(3, "����");

		list.add(4, "��ݮ");
		list.add(5, "��֦");
		list.add(4, "����");//����Ч������4λ�á�����˳��
		list.set(5, "����");//���Ч����
		//���˵���Զ�ĵط���
		list=move("����");
		//ȡ������ʹ�õ�����ȡ������3��ȡ�����ķ���
		for(int i=0;i<list.size();i++){
			String str = (String)list.get(i);
			System.out.println(str);
		}
	}
	public static List<String> move(String difang){
		System.out.println("�����Ӱᵽ��"+difang);
		return list;
	}

}
