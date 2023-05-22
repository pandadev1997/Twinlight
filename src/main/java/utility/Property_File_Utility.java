package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_File_Utility {
	public String read_Data_from_prpertyfile(String data) throws Throwable {
		FileInputStream fis=new FileInputStream(Iconstant.propertyfile);
		Properties po=new Properties();
		po.load(fis);
		String value = po.getProperty(data);
		return value;
	}

}
