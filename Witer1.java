package Serialazation;

import java.io.FileWriter;
import java.io.IOException;

public class Witer1 {

	public static void main(String[] args) {
		try (FileWriter wrt =new FileWriter("./src/CSJ36text3.txt,true");)
		{
			
			char[] ch= {'G','O','O','D'};
			wrt.write(ch);
			wrt.write(" ");
			String msg="cyber success";
			char[] ch2=msg.toCharArray();
			wrt.write(ch2,2,5);
			System.out.println("check your file");
		}catch(IOException e) {
			System.out.println("problem in file");
		}

	}

}
