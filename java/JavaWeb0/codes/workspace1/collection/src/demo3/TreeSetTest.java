package demo3;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> tree = new TreeSet<>();
		
		tree.add(10);
		tree.add(15);
		tree.add(12);
		tree.add(18);
		tree.add(8);
		tree.add(3);
		tree.add(4);
		tree.add(9);
		//treeSetʵ���˶����ֵȻ��������Ȼ���򣡴�С����
		//ֻҪ��Щ��ʵ����Comparable�ӿڣ�
		for(Integer i:tree){
			System.out.println(i);
		}
		System.out.println("-------------");
		System.out.println(tree.first());//��С��
		System.out.println(tree.last());//����
		TreeSet<Integer> tree2=(TreeSet<Integer>)tree;
		System.out.println("floor"+tree2.floor(5));//4
		System.out.println("ceil"+tree2.ceiling(11));//12
		System.out.println(tree2.headSet(10));//10ǰ��ģ�����10
		System.out.println(tree2.tailSet(10));//10����ģ�����10
		System.out.println("low"+tree2.lower(12));//10
		
 	}

}
