package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import demo2.Car;


public class MapTest {

	public static void main(String[] args) {
		Map<Integer,Car>  map = new HashMap<Integer,Car>();
		//���������� k�����ظ��� value�����ظ���
		map.put(1020, new Car("toyota",150000.00));
		map.put(1010, new Car("honda",120000.00));
		map.put(1012, new Car("benz",550000.00));
		map.put(700, new Car("BMW",350000.00));
		map.put(800, new Car("��",80000.00));
		map.replace(701, new Car("wuling",50000));
		//ȡ�������� ����keyȡvalue
		Car car = map.get(701);
		System.out.println(car);
		//�������еĳ�
		System.out.println("--------------------------");
		Set<Integer> keys=map.keySet();
		for (Integer integer : keys) {
			System.out.println(""+integer +map.get(integer));
		}
		System.out.println("--------------------------");
		Set<Entry<Integer, Car>> set= map.entrySet();
		for (Entry<Integer, Car> entry : set) {
			System.out.println(""+entry.getKey()+entry.getValue());
		}
		
	}

}
