package Serialazation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TravelUtility {

	public Set<Travel> generateTravelObject(File file){
		Set<Travel> setOfObjects =new TreeSet();
		try 
		{
			FileReader reader=new FileReader(file);
			//constructing object of BufferredReader to read line by line data efficiency
			BufferedReader br=new BufferedReader(reader);
			String line=null;
			while((line=br.readLine())!=null) {
				
				
				//System.out.println(line);
				//String [] split (String reg)
				
				String [] str =line.split(",");
				//System.out.println(Arrays.toString(str));
				
				System.out.println(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]);
				
				String packageId=str[0];
				String packageSource=str[1];
				String packageDest=str[2];
				int nod =Integer.parseInt(str[3]);
				double cost=Double.parseDouble(str[4]);
				//constructor object of Travel class
				Travel t=new Travel(packageId,packageSource,packageDest,nod,cost);
				setOfObjects.add(t);
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return setOfObjects;
		
	}

}
