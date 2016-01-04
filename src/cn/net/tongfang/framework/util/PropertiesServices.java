package cn.net.tongfang.framework.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesServices {
	public Properties readProperties(){
		String filepath = this.getClass().getClassLoader().getResource("/").getPath() + "systemSetting.properties";
		filepath = filepath.substring(0, filepath.length()).replace("%20", " ");
		Properties properties = new Properties(); 
		try {
			InputStream inputStream = new FileInputStream(filepath);
			properties.load(inputStream);
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	public void writeProperties(Properties properties){
		String filepath = this.getClass().getClassLoader().getResource("/").getPath() + "systemSetting.properties";
		filepath = filepath.substring(0, filepath.length()).replace("%20", " ");
		try {
			OutputStream  outputStream = new FileOutputStream(filepath);
			properties.store(outputStream, "");
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
