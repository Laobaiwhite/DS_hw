package ����;
import javax.swing.JButton;

import java.util.*;
public class RandomNumber{
	int index;
	
	public RandomNumber(int index){
		this.index = index;
	}
		
    public ArrayList Random(){
        //���� [0-n) �����ظ��������
        // st ����������Щ�����
        ArrayList list = new ArrayList();
        
        Random rand = new Random();
        boolean[] bool = new boolean[index];
        
        int num =0;
        
        for (int i = 0; i<index; i++){
            
            do{
                //�������������ͬ����ѭ��
                num = rand.nextInt(index);    
             
            }while(bool[num]);
            
            bool[num] =true;
            
            list.add(num);
        
        
        }
        return list;     
}   
    } 
    