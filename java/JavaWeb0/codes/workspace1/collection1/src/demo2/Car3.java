package demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//��αȽ�����֮��Ĺ�ϵ����С��
//����2 �����ƻ�Car2�౾��ʵ�ֱȽϣ������Ƕ���һ��Car�ıȽ�����
//ʵ�� Comparator�ӿڣ�
public class Car3 {
	public double price;
	private String brand ;
	public Car3 (String brand){
		this.brand = brand;
		price = 100000.0;
	}
	public Car3 (String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	public String toString(){
		return "hell the car is made by "+brand
				+ " and the price is "+price;
	}
	
	
	public static void main(String[] args){
		
		Car3 car1 = new Car3("toyota",150000.00);
		Car3 car2 = new Car3("benz",500000.00);
		Car3 car3 = new Car3("��ʱ��",1000000.00);
		Car3 car4 = new Car3("��",80000.00);
		
		Set<Car3> set =new TreeSet<Car3>(new Comparator<Car3>(){
			@Override
			public int compare(Car3 o1, Car3 o2) {
				// TODO Auto-generated method stub
				if(o1.price>o2.price)
					return 1;//�ȵ�ǰ������-1
				else if(o1.price==o2.price)
					return 0;//�����0
				else return -1;
			}
		
		});
		
		set.add(car1);
		set.add(car2);
		set.add(car3);
		set.add(car4);
		System.out.println("----------------------");
		for(Car3 car:set){
			System.out.println(car);
		}
		
		
	}
}
