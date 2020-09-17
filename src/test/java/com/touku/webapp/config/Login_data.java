package com.touku.webapp.config;

/**
 * @author Piyush Lalwani
 * 
 */

public class Login_data {

	public enum Login_enum{
		//TEST LOGIN DATA
		Login1("py123","py123456"),
		Login2("py676","py676767");
		
		public String username;
		public String password;
		
		private Login_enum(String Uname, String Passwd) {
			this.username = Uname;
			this.password = Passwd;
			
		}
	}
}
