package Serialazation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		File file=new File("./src/csj36text1.txt");
		Writer writer =new FileWriter(file);
		Scanner sc =new Scanner(System.in);
		System.out.println("enter yor message");
		String msg=sc.nextLine();
		writer.write(msg);
		writer.close();
		System.out.println("entered successfully");

	}

}
