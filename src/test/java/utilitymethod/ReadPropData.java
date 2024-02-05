package utilitymethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropData {
	public String getPropData (String DataToBeRead) throws IOException 
	{
		String pathofFile = System.getProperty("user.dir")+"//test//resource//config.properties";
		FileInputStream fis = new FileInputStream(pathofFile);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(DataToBeRead);
		System.out.println(value);
		return value;
		
		
		
	}

}
