package com.cg.eis.service;

public interface Validator {
	
	String e_idpattern="[1-9][0-9][0-9]";///to validate Employee Id..........
	String e_namepattern ="[a-zA-Z][a-z]*+[']*[.]*[ ]*+[a-zA-Z]*";//to validate employee name.......
	String e_salary="[0-9]*+[.]*+[0-9]*";// to validate salary............
	
	
	public static boolean validatedata(String data, String pattern)
	{
		return data.matches(pattern);
	}

}
