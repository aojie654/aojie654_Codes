package cn.itcast.demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class CheckCode {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//1. ����һ��ͼƬ
		int width = 100;
		int height = 50;
		
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		//2.����ͼƬ
		Graphics  g = image.getGraphics();
		g.setColor(Color.PINK);
		//3.��䱳��ɫ
		g.fillRect(0, 0, width, height);
		
		g.setColor(Color.BLUE);
		g.drawRect(0, 0, width - 1, height - 1);
		
		
		//1.׼������Դ
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		//2.��������Ǳ�
		String checkCode = "";
		Random ran = new Random();
		for (int i = 0; i < 4; i++) {
			int index = ran.nextInt(str.length() - 1);
			//3.��ȡ�ַ�
			char ch = str.charAt(index);
			checkCode += ch;
		}
		
		g.setColor(Color.RED);
		g.drawString(checkCode, 30, 25);
		
		//3.��ͼƬ��������
		ImageIO.write(image, "jpg", new FileOutputStream("a.jpg"));
	}
}
