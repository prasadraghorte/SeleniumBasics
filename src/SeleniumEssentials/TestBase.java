package SeleniumEssentials;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties or;
	public File file;
	private FileReader reader;
	public void setup() throws IOException
	{
		or = new Properties();
		file = new File(System.getProperty("user.dir"+"/src/AdvancedSelenium/Data.properties"));
		reader = new FileReader(file);
		or.load(reader);
		
		file = new File(System.getProperty("user.dir"+"/src/AdvancedSelenium/objrep.properties"));
		reader = new FileReader(file);
		or.load(reader);
	}

}
