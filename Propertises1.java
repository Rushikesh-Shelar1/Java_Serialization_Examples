package Serialazation;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Propertises1 {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileReader reader=new FileReader("./src/dbconfig.properties");
		Properties p=new Properties();
		//void load (Reader readerobject)
		//void load(InputStream obj)
		
		p.load(reader);
		
		//String getProperty(String key)
		String driverName=p.getProperty("driver");
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pw=p.getProperty("password");
		System.out.println(driverName+" "+url+" "+un+" "+pw);

		Class.forName(driverName);
		Connection con=DriverManager.getConnection(url,un,pw);
		System.out.println("connection established");
		
		
	}

}
