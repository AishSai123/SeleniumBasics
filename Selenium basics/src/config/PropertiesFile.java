package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class PropertiesFile {


	static Properties prop=new Properties();
	static String Projectpath=System.getProperty("user.dir");

	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties() {

		try {
			InputStream input= new FileInputStream(Projectpath+"/src/config/config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			TestwithProperties.Browsername=browser;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	public static void setProperties() {
		try {
			OutputStream output= new FileOutputStream(Projectpath+"/src/config/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
