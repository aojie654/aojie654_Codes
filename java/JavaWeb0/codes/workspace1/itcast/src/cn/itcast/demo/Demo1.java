package cn.itcast.demo;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{2,32,5,51,1};
		System.out.println("����֮ǰ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//����
		Arrays.sort(arr);
		
		System.out.println("����֮��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
