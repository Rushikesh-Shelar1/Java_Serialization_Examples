package Serialazation;

import java.io.FileReader;
import java.io.IOException;

public class Reader1 {

	public static void main(String[] args)throws IOException {
		java.io.Reader reader=new FileReader("./src/csj36text1.txt");
		int k=0;
		while((k=reader.read())!=-1) {
			System.out.print((char)k);
		}
	}

}
