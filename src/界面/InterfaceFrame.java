package ����;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ����.Music;
import ����.SortScore;

public class InterfaceFrame extends JFrame {
	/** �汾���Ʊ�ʶ **/
	private static final long serialVersionUID = 1L;
	
	/** ҵ���߼����� **/
	
	private final static int PANEL_WIGHT = 800;
	private final static int PANEL_HEIGHT =600;
	private final static String PANEL_TITLE_NAME = "����������ս";
	
	
	
	public JFrame f2;
	public JButton jb3;
	public JButton jb4;
	public  JButton jb5;
	public JButton jb6;
	public JButton jb7;
	public JButton jb8;
	public JLabel jl1;
	public ImageIcon im;
	
	 int count = 1;
	
	public InterfaceFrame(){
		f2 = new JFrame("�����ִ���ս");
		jb3 = new JButton("��ʼ��Ϸ");
		jb4 = new JButton("PvP��ս");
		jb5 = new JButton("�鿴ս��");
		jb6 = new JButton("��������");
		jb7 = new JButton("�˳���Ϸ");
		jb8 = new JButton("�ر�����");
		im = new ImageIcon("ѡ�����.gif");
		jl1 = new JLabel(im);
	}
	
	public void InterfaceLanch(){
		f2.setSize(1000,700);
    	f2.setLocation(500,300);
    	
    	Font font4 = new Font("����",Font.BOLD |Font.ITALIC,30);
    	jb3.setFont(font4);
    	
    	Font font5 = new Font("����",Font.BOLD |Font.ITALIC,30);
    	jb4.setFont(font5);
    	
    	Font font6 = new Font("����",Font.BOLD |Font.ITALIC,30);
    	jb5.setFont(font6);
    	
    	Font font7 = new Font("����",Font.BOLD |Font.ITALIC,30);
    	jb6.setFont(font7);
    	
    	Font font8 = new Font("����",Font.BOLD |Font.ITALIC,30);
    	jb7.setFont(font8);
    	
    	Font font9 = new Font("����",Font.BOLD |Font.ITALIC,30);
    	jb8.setFont(font9);
    	//��������
    	
        f2.getLayeredPane().add(jl1, new Integer(Integer.MIN_VALUE));
	    jl1.setBounds(0,0,im.getIconWidth(), im.getIconHeight());
	    	
	    Container cp1=f2.getContentPane();
	    cp1.setLayout(null);
	    	
	    ((JPanel)cp1).setOpaque(false);//��ӱ���ͼƬ

    	f2.setLayout(null);
    	
    	f2.add(jb3);
    	f2.add(jb4);
    	f2.add(jb5);
    	f2.add(jb6);
    	f2.add(jb7);
    	f2.add(jb8);

    	
    	jb3.setBounds(50,0,300,80);
    	jb4.setBounds(50,100,300,80);
    	jb5.setBounds(50,200,300,80);
    	jb6.setBounds(50,300,300,80);
    	jb7.setBounds(50,500,300,80);
    	jb8.setBounds(50,400,300,80);
    	//��������
    	
    	 
  
	
	jb3.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
			 f2.setVisible(false);
			 StartGame itf = new StartGame();
			 itf.sendMain(itf);
			 itf.StartLanch();;
		   }
 	});//��ʼ��Ϸ
	
	jb5.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
			 f2.setVisible(false);
			 try{
			 SortScore.lllist();
			 SortScore.sortscore();
			 ScoreFrame sf = new ScoreFrame();
			 sf.ScoreLanch();
			 }catch (ClassNotFoundException|IOException e1) {

					e1.printStackTrace();
				}
		   }
	});//�鿴���а�
 
	jb6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			Music mc = new Music();
			
				mc.playmusic();
			
		}
		
	});//��������
	
	jb7.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		   System.exit(0);
			
		}
	});
	
	jb8.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Music mc2 = new Music();
			
			mc2.stopmusic();
		}
	});//ֹͣ��������
	f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f2.setVisible(true);
}
	
	
}
