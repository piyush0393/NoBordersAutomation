package com.touku.webapp.config;

/**
 * @author Piyush Lalwani
 * 
 */

public class Login_data {

	public enum Login_enum{
		
		Login1("",""),
		Login2("","");
		
		public String username;
		public String password;
		
		private Login_enum(String Uname, String Passwd) {
			this.username = Uname;
			this.password = Passwd;
			
		}
	}
}
