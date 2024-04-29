package Serialazation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// TODO Auto-generated method stub
		
		FileInputStream fin=new FileInputStream("D:/csj36.txt");
		ObjectInputStream in =new ObjectInputStream(fin);
		//Object readObject() throws IOException ,ClassnotfoundException 
		Account account =(Account)in.readObject();
		fin.close();
		in.close();
		System.out.println(account);

	}

}
