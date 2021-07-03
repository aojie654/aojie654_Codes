package demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// ����һ�����ж���que ������ArrayDeque����˫�˶��У�
		Queue<String> que = new ArrayDeque<>();
		//��Ӳ�����
		que.offer("�۲�");
		que.offer("������");
		que.offer("��ޣ");
		que.offer("�㴻");
		//���Ӳ�����
		String cai=que.poll();
		System.out.println(cai);
		//���ӣ�����ɾ��
		cai=que.peek();
		System.out.println(cai);
		
		System.out.println("----------------");
		for(String local:que){
			System.out.println(local);
		}
		
		Deque<String> deque=(Deque<String>)que;
		//deque.poll(); ���� poll offer peek��������first last������
		//deque.pollFirst();
		//deque.pollLast();
		//deque.offerFirst();
		//deque.offerLast();
		//������ջ��push pop������
		deque.push("������");//ѹ�����ͷ����
		deque.push("ʥŮ��");//ѹ�����ͷ����
		System.out.println("----------------");
		System.out.println(deque.pop());//��������ɾ��ջ
		System.out.println("----------------");
		for(String local:que){
			System.out.println(local);
		}
 	}

}
