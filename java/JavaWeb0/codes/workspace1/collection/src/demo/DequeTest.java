package demo;

import java.util.*;


public class DequeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<>();
		//���з���
		deque.offer("�㽶");
		deque.offer("ƻ��");
		deque.offer("����");
		System.out.println("--------------------------");
		for(String str:deque){
			System.out.println(str);
		}
		System.out.println("--------------------------");
		
		System.out.println(deque.poll());//���𣿵�����һ��
		System.out.println(deque.peek());//�����������ص�һ����
		System.out.println("--------------------------");
		for(String str:deque){
			System.out.println(str);
		}
		System.out.println("--------------------------");
				
		System.out.println("--------------------------");
		//ջ���÷���  //ѹ����ж�ͷ��
		deque.push("��ݮ");//ѹ�֣�
		deque.push("��ݮ");//ѹ�֣�
		System.out.println("--------------------------");
		for(String str:deque){
			System.out.println(str);
		}
		System.out.println("--------------------------");
				
		
		System.out.println(deque.pop());//�������һ����
		System.out.println("--------------------------");
		for(String str:deque){
			System.out.println(str);
		}
		
		Queue<String> queue = new ArrayDeque<>();
		//queue����ֻ�ж��еĻ���������peak poll offer
	}

}
