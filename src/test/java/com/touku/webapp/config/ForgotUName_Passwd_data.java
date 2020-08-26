package com.touku.webapp.config;

public class ForgotUName_Passwd_data {

	public enum Forgot_Uname_data {
		ForgotUname1("piyushlalwani393@gmail.com"),
		ForgotUname2("piyush.lalwani@noborders.net");
		
		public String Email;
		
		private Forgot_Uname_data(String email) {
			this.Email = email;
		}
	}
	
	public enum Forgot_Passwd_data {
		ForgotPasswd1("py3531","","",""),
		ForgotPasswd2("py3531","","","");
		
		public String Username;
		public String VerCode;
		public String NewPassword;
		public String Re_enterPassword;
		
		private Forgot_Passwd_data(String Uname, String VCode, String NewPasswd, String ReEnterPasswd) {
			this.Username = Uname;
			this.VerCode = VCode;
			this.NewPassword = NewPasswd;
			this.Re_enterPassword = ReEnterPasswd;
		}
	}
}
