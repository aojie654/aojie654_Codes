package demo;

public class Time {
	private static String time=""; 
	//�õ���ǰϵͳʱ�䡣
	public static String showTime(){
		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		time =df.format(new java.util.Date());
		
		return time;
	}
}
