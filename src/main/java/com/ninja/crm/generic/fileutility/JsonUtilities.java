package com.ninja.crm.generic.fileutility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtilities {
public String readdatafromjson(String key) throws IOException, ParseException {
	FileReader fr=new FileReader("./src/main/resources/appcommondata.json");
	JSONParser parser=new JSONParser();
	Object javaobj=parser.parse(fr);
			JSONObject jobj=(JSONObject)javaobj;
			String value=jobj.get(key).toString();
			return value;
}
}
