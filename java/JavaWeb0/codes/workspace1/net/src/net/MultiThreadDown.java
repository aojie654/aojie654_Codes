package net;

public class MultiThreadDown
{
	public static void main(String[] args) throws Exception
	{
		// ��ʼ��DownUtil����
		final DownUtil downUtil = new DownUtil("http://www.xjtucc.cn/_mediafile/"
				+ "xjtucc/2017/11/30/0fj0snt3g2.jpg"
			, "2.jpg", 4);
		// ��ʼ���� flashget
		downUtil.download();
		new Thread()
		{
			public void run()
			{
				while(downUtil.getCompleteRate() < 1)
				{
					// ÿ��0.1���ѯһ���������ɽ��ȣ�
					// GUI�����пɸ��ݸý��������ƽ�����
					System.out.println("����ɣ�" 
						+ downUtil.getCompleteRate());
					try
					{
						Thread.sleep(1000);
					}
					catch (Exception ex){}
				}
			}
		}.start();
	}
}
