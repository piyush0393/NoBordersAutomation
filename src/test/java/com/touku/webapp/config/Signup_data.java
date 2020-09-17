package com.touku.webapp.config;

/**
 * @author Piyush Lalwani
 * 
 */

public class Signup_data {

	public enum Signup_enum {
				
		Signup1("+91","7355341728","107893"),
		Signup2("+91","8792656462","107893"),
		Signup3("+91","8787698987","107893"),
		Signup4("+91","8787698768","107893");
			


		public String CountryCode;
		public String MobileNumber;
		public String SMSVerCode;
		
	    private Signup_enum(String Country_code, String Mobile_number, String SMSVer_code) {
	 		this.CountryCode = Country_code;
	 		this.MobileNumber = Mobile_number;
	 		this.SMSVerCode = SMSVer_code;
	 	}
	}
	
	public enum Signup_Email_enum {
		
		Signup_email1("a.b@c.com","a.b@c.com"),
		Signup_email2("b.c@d.com","b.c@d.com"),
		Signup_Invalid_email1("a.h.com","a.h.com"),
		Signup_Mismatch_email1("a.h@g.com","a.j@g.com");	


		public String Email;
		public String ConfirmEmail;
		
	    private Signup_Email_enum(String email, String confirmEmail) {
	 		this.Email = email;
	 		this.ConfirmEmail = confirmEmail;
	 	}
	}
	
	public enum Signup_UnamePassword_enum {
		
		Signup_UnamePassword1("py123","py123456","py123456"),
		Signup_UnamePassword2("py676","py676767","py676767"),
		Signup_Invalid_ConfirmPasswd1("py345","py345656","py3457"),
		Signup_Invalid_PasswdLength1("py345","py6567","py6567");	


		public String Username;
		public String Password;
		public String ConfirmPasswd;
		
	    private Signup_UnamePassword_enum(String Uname, String Passwd, String confirmPasswd) {
	 		this.Username = Uname;
	    	this.Password = Passwd;
	 		this.ConfirmPasswd = confirmPasswd;
	 	}
	}
	
}