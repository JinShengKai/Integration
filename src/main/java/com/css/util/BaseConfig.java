package com.css.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseConfig {

	
	
	public  static String token;
	public static String baseKey;
	public static String owner;
	public static String url;
	public static String local_name;
	public static String Content_Type;
	public static String base_id;
	public static String tenant_id;
	public static String odpsServer;
	public static String tunnelServer;
	public static String odpsaccessId;
	public static String odpsaccessKey;
	static {
		try {
			Properties baseConfig=new Properties();
			InputStream is =Thread.currentThread().getContextClassLoader().getResourceAsStream("baseconfig.properties");
			baseConfig.load(is);
			token=baseConfig.getProperty("token");
			baseKey=baseConfig.getProperty("baseKey");
			owner=baseConfig.getProperty("owner");
			url=baseConfig.getProperty("url");
			local_name=baseConfig.getProperty("local_name");
			Content_Type=baseConfig.getProperty("Content_Type");
			base_id=baseConfig.getProperty("base_id");
			tenant_id=baseConfig.getProperty("tenant_id");
			odpsServer=baseConfig.getProperty("odpsServer");
			tunnelServer=baseConfig.getProperty("tunnelServer");
			odpsaccessId=baseConfig.getProperty("odpsaccessId");
			odpsaccessKey=baseConfig.getProperty("odpsaccessKey");
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	
}
