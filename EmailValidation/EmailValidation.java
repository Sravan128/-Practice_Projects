package com;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {
	public static boolean valid(String search_email)
	{    //For Validating the Email id
		 String regex = "^(.+)@(.+)$";
		 Pattern pattern=Pattern.compile(regex);
		 Matcher matcher=pattern.matcher(search_email);
		 return matcher.matches();
		 }
	public static void main(String[] args) {
		ArrayList<String> email=new ArrayList<String>();
		//list of emails
		email.add("personemail1@email.com");
		email.add("personemail2@email.com");
		email.add("personemail3@email.com");
		email.add("personemail4@email.com");
		email.add("personemail5@email.com");
		email.add("personemail6@email.com");
		email.add("person.mail*email.com");//invalid email
		Scanner sin=new Scanner(System.in);
		String search_email;//user input email ID
		int i;
		System.out.println("Enter the email to Search : \n");
		search_email=sin.nextLine();
		if(valid(search_email))
		{
			
			boolean a=email.contains(search_email);
			if(a)
			{
				System.out.println(search_email+" ---  found \n");//Email found
				
			}
			else
			{
				System.out.println("Not found  \n");//if not found
				
			}
			
			}
		else
			System.out.println("InValid Email ID.Please Enter a Valid Email Id:\n");
	}
		
	}



