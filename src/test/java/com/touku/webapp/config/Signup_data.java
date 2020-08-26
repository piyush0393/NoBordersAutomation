package com.touku.webapp.config;

/**
 * @author Piyush Lalwani
 * 
 */

public class Signup_data {

	public enum Signup_enum{
				
		Signup1("+91","7355341728",""),
		Signup2("+91","8792656462","");
			


		public String CountryCode;
		public String MobileNumber;
		public String SMSVerCode;
		
	    private Signup_enum(String Country_code, String Mobile_number, String SMSVer_code) {
	 		this.CountryCode = Country_code;
	 		this.MobileNumber = Mobile_number;
	 		this.SMSVerCode = SMSVer_code;
	 	}
	}
	
	
}