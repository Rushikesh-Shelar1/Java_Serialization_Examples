package Serialazation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffereredReader1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		String name=br.readLine();
		System.out.println("enter your id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("enter salary");
		double salary =Double.parseDouble(br.readLine());
		System.out.println("enter phone");
		long ph =Long.parseLong(br.readLine());
		System.out.println("enter weight");
		float wt=Float.parseFloat(br.readLine());
		System.out.println("your entered: "+name+" "+id+" "+salary+" "+ph+" "+wt);
		
		}

}
