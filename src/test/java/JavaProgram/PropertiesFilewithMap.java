package JavaProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertiesFilewithMap {

	public static void main(String[] args)  {
		Map<String,String> map=new HashMap();
		String currwD=System.getProperty("user.dir");
		try{
			File file2=new File(currwD+"\\src\\test\\resources\\JavaTwo.properties");
			FileInputStream file=new FileInputStream(file2);// TODO Auto-generated method stub
		
        Properties prop=new Properties();
        
        prop.load(file);
        
        for(String s:prop.stringPropertyNames())
        {
        	String t=prop.getProperty(s);
        	map.put(s, t);
        }
	}catch(Exception e)
	{
		e.getMessage();
	}
	
		for(Entry<String,String> entry:map.entrySet())
		 if(entry.getValue().contains(","))
		 {
			 String[] split=entry.getValue().split(",");
			 for(String q:split)
			 {
				 System.out.println(q);
			 }
		 }else
		{
			System.out.println("keys "+entry.getKey()+" values  "+entry.getValue());
		}
	        
		
	}
}
