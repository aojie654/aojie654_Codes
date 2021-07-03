package net1;

import java.io.*;
import java.net.*;

public class DownFile{
/**
 * ������Url�������ļ�
 * @param urlStr
 * @param fileName
 * @param savePath
 * @throws IOException
 */
public static void  downLoadFromUrl(String urlStr,String fileName,String savePath) throws IOException{
    URL url = new URL(urlStr);  
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();  
            //���ó�ʱ��Ϊ3��
    conn.setConnectTimeout(3*1000);
    //��ֹ���γ���ץȡ������403����
    conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

    //�õ�������
    InputStream inputStream = conn.getInputStream();  
    //��ȡ�Լ�����
    byte[] getData = readInputStream(inputStream);    

    //�ļ�����λ�� IO File �ļ������ɣ����ʡ��ļ��� ��ɾ�ģ�
    File saveDir = new File(savePath);
    if(!saveDir.exists()){
       boolean bool= saveDir.mkdirs();
       System.out.println(bool);
    }
    File file = new File(saveDir+File.separator+fileName);    
    FileOutputStream fos = new FileOutputStream(file);     
    fos.write(getData); 
    if(fos!=null){
        fos.close();  
    }
    if(inputStream!=null){
        inputStream.close();
    }
    System.out.println("info:"+url+" download success"); 

}



/**
 * ���������л�ȡ�ֽ�����
 * @param inputStream
 * @return
 * @throws IOException
 */
public static  byte[] readInputStream(InputStream inputStream) throws IOException {  
    byte[] buffer = new byte[1024];  
    int len = 0;  
    ByteArrayOutputStream bos = new ByteArrayOutputStream();  
    while((len = inputStream.read(buffer)) != -1) {  
        bos.write(buffer, 0, len);  
    }  
    bos.close();  
    return bos.toByteArray();  
}  

public static void main(String[] args) {
    try{
        downLoadFromUrl("http://www.xjtucc.cn/_mediafile/xjtucc/2017/11/30/0fj0snt3g2.jpg",
                "1.jpg","d:/resource/");
    }catch (Exception e) {
        // TODO: handle exception
    	e.printStackTrace();
    }
}

}