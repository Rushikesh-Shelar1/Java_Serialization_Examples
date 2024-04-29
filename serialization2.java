package Serialazation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
	private static String customerName;
	private long customerCode;
	public static String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		customerName = customerName;
	}

	public long getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(long customerCode) {
		this.customerCode = customerCode;
	}
	
	public String toString()
	{
		return customerName + " "+customerCode;
	}
}

public class serialization2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("D:/csj36e1.txt");
		ObjectOutputStream out =new ObjectOutputStream(fout);
		Customer customer =new Customer();
		customer.setCustomerName("xyz");
		customer.setCustomerCode(6568L);
		out.writeObject(customer);
		fout.close();
		out.close();
		System.out.println("data has been serialized");
		
		
		//deserialization 
		
		FileInputStream fin=new FileInputStream("D:/csj36e1.txt");
		ObjectInputStream in =new ObjectInputStream(fin);
		Customer customerData=(Customer)in.readObject();
		System.out.println(customerData);
		

	}

}
