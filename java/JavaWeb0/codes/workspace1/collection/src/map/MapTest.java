package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import demo3.Bag;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer,Bag> map = new HashMap<Integer,Bag>();
		//����һ�Ѱ���
		map.put(1001, new Bag("MK",3000.00));
		map.put(1005, new Bag("Coach",3500.00));
		map.put(1010, new Bag("belle",800.00));
		map.put(900, new Bag("MGM",8000.00));
		map.put(800, new Bag("GUCCI",30000.00));
		//�滻
		 map.replace(800, new Bag("hermas",100000));
		//ȡ��ĳ���� ʹ��key ʹ��Կ��
		Bag bag =map.get(800);
		System.out.println(bag);
		
		//�������еġ�
		Set<Integer> keys =map.keySet();
		for (Integer integer : keys) {
			Bag b =map.get(integer);
			System.out.println("key:"+integer +" "+b);
		}
		//�������е�Ԫ�أ�
		Set<Entry<Integer, Bag>> set =map.entrySet();
		Iterator<Entry<Integer, Bag>> i= set.iterator();
		System.out.println("--------------------------");
		while(i.hasNext()){
			Entry<Integer, Bag> entry=	 i.next();
			System.out.println(""+entry.getKey()+entry.getValue());
		}


	}

}
