package ����;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LLKServer {
	public void start(){
		int x=0;
		int y=0;
		int i=0;
		boolean win =false;
		Socket s1 =null;
		Socket s2 =null;
		ServerSocket ss=null;
		DataOutputStream dos;
		   try{
			    ss=new ServerSocket(22222);

		   }catch(IOException e){
			   e.printStackTrace();
		   }
		   while(true){
			   
			   try{
				   if(i==0){

			    s1 = ss.accept();
			    System.out.println("���һ���ӳɹ�");
			   DataInputStream dis = new DataInputStream(s1.getInputStream());

			   int time =dis.readInt();
			   x=time;
			   dos = new DataOutputStream(s1.getOutputStream());
			   dos.writeInt(time);
			   System.out.println("���1����ʱ�䣺"+x+ "s");

			   i++;
			   //System.out.println("��һ��������ӳɹ�");}
				   if(i==1){
					    s2 = ss.accept();
					    System.out.println("��Ҷ����ӳɹ�");
						   DataInputStream dis1 = new DataInputStream(s2.getInputStream());

						   int time1 =dis1.readInt();
						   y=time1;
						   System.out.println("���2����ʱ�䣺"+y+ "s");
						   if(x>y){
							   win=true;
						   DataOutputStream dos1 = new DataOutputStream(s2.getOutputStream());
						   dos.writeUTF("���2��ʤ");
						   dos1.writeUTF("���2��ʤ");
						   }
						   if(x<y){
							   win=false;
						   DataOutputStream dos1 = new DataOutputStream(s2.getOutputStream());
						   dos.writeUTF("���1��ʤ");
						   dos1.writeUTF("���1��ʤ");}

						   //System.out.println("��һ��������ӳɹ�");
				   }}
		   }catch(IOException e){
			   e.printStackTrace();
		   }
		   }
	}
   public static void main(String[] args){
         new LLKServer().start();
   }
}
