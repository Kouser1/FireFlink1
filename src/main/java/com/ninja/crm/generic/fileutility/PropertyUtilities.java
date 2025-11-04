package com.ninja.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtilities {
public String readthedatafrompropertyfile(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
	Properties pp=new Properties();
	pp.load(fis);
	String value =pp.getProperty(key);
	return value;
	
}
}
