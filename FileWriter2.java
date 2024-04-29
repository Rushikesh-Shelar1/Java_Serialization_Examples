package Serialazation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter2 {

	public static void main(String[] args) {
		try (FileWriter writer =new FileWriter("./src/CSJ36text2.txt,true");)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the course name");
			String cname=sc.nextLine();
			writer.write(cname);
			writer.write(",");
//			sc.nextLine();
			System.out.println("enter course price");
			double price =sc.nextDouble();
			//converting double into string
			String cprice =String.valueOf(price);
			writer.write(cprice);
			writer.write(",");
			System.out.println("enter course duration");
			int duration =sc.nextInt();
			String cduration  =String.valueOf(duration);
			writer.write(cduration);
			System.out.println("course saved into file");
			writer.write("\n");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
