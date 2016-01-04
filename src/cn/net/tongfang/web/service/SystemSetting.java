package cn.net.tongfang.web.service;

import java.util.Properties;

import cn.net.tongfang.framework.util.PropertiesServices;
import cn.net.tongfang.web.service.bo.SystemSettingBO;

public class SystemSetting {
	private PropertiesServices prop;

	public void setProp(PropertiesServices prop) {
		this.prop = prop;
	}

	public String savModifyAuthority(SystemSettingBO bean){
		Properties properties = new Properties(); 
		properties.setProperty("modify_authority", bean.getModifyAuthority());
		prop.writeProperties(properties);
		return "1";
	}
	public String getModifyAuthority(){
		Properties properties = prop.readProperties();
		return properties.getProperty("modify_authority").toString();
	}
}
