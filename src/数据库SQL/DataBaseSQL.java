package ���ݿ�SQL;
import java.sql.*;

public class DataBaseSQL {
	public static void main(String[] args) throws Exception{
	Class.forName("org.gjt.mm.mysql.Driver").newInstance(); 
	String  url  ="jdbc:mysql://localhost/Users?user=soft&password=soft1234&useUnicode=true&characterEncoding=8859_1";
	//myDBΪ���ݿ��� 
	Connection  conn=  DriverManager.getConnection(url);
	
	}
}
