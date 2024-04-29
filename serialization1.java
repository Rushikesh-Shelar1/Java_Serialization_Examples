package Serialazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{


	/**
	 * @param acnNumber
	 * @param pinCodeNumber
	 * @param accountHolderName
	 */
	public Account(long acnNumber, int pinCodeNumber, String accountHolderName) {
		super();
		this.acnNumber = acnNumber;
		this.pinCodeNumber = pinCodeNumber;
		this.accountHolderName = accountHolderName;
	}
	private long acnNumber;
	private int pinCodeNumber;
	private String accountHolderName;


public long getAcnNumber() {
	return acnNumber;
}

public int getPinCodeNumber() {
	return pinCodeNumber;
}

public String getAccountHolderName() {
	return accountHolderName;
}

@Override
public String toString() {
	return "Account [acnNumber=" + acnNumber + ", pinCodeNumber=" + pinCodeNumber + ", accountHolderName="
			+ accountHolderName + "]";
}


}
public class serialization1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileOutputStream ()throws FileNotException
		FileOutputStream fout=new FileOutputStream("D:/csj36.txt");
		ObjectOutputStream out =new ObjectOutputStream(fout);
		//creating object of Account class
		Account accountobj=new Account (1234l,6789,"ABC");
		//writing the state of the object into byteStream
		out.writeObject(accountobj);
		fout.close();
		out.close();
		System.out.println("data has been serialized");

	}

	

}
