package com.ninja.crm.generic.javautility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class javaUtilities {
public int randomnumber() {
	Random rm=new Random();
	int rannum=rm.nextInt(1000);
	return rannum;
}
public String selectExpectedDate(int expdate){
	Date date=new Date();
	SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
	sim.format(date);
	Calendar cal =sim.getCalendar();
	cal.add(Calendar.DAY_OF_MONTH,expdate);
	String expdate1=sim.format(cal.getTime());
	return expdate1;
	
}
}
