package com.simplilearn.ValdationEmail;


import java.util.regex.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> emails = new ArrayList<String>();
		
		emails.add("abc@domain.co.in");
		emails.add("abc@domain.com");
		emails.add("abc.name@domain.com");
		emails.add("abc@domain.com");
		
		
		String regex = "^(.+)@(.+)$";
		
		Pattern pattern = Pattern.compile(regex);
		
		for(String email:emails)
		{
			Matcher matcher = pattern.matcher(email);
			System.out.println(email+" : "+matcher.matches()+"\n");
			
		}
	}

}
	


