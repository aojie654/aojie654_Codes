package demo3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//ͨ��ʵ��Comparable ����ʵ������TreeSet ����Collections.sort()������
public class Bag implements Comparable<Bag>{

	private String brand;
	public double price;
	@Override
	public int compareTo(Bag o) {
		if(o.price>this.price)
			return -1;
		else if(o.price==this.price)
			return 0;
		else return 1;
	}
	public Bag(String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	public String toString(){
		return "the bag is made by "+brand +" and the price is "
				+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Bag> bags = new TreeSet<Bag>();
		Bag bag1=new Bag("LV",15000.0);
		Bag bag2=new Bag("hermas",100000.0);
		Bag bag3=new Bag("chanel",30000.0);
		Bag bag4=new Bag("coach",3000.0);
		Bag bag5=new Bag("MK",2000.0);
		bags.add(bag1);
		bags.add(bag2);
		bags.add(bag3);
		bags.add(bag4);
		bags.add(bag5);
		for(Bag bag:bags){//foreachѭ��
			System.out.println(bag);
		}
 	}


}
