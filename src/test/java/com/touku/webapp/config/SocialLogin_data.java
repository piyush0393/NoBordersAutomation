package com.touku.webapp.config;

public class SocialLogin_data {
					
			public enum Facebook_data {
				Facebook1("",""),
				Facebook2("","");
				
				public String Username;
				public String Password;
				
				private Facebook_data(String Uname, String Passwd) {
					this.Username = Uname;
					this.Password = Passwd;
				}
				
			}
			
			public enum Line_data {
				Line1("",""),
				Line2("","");
				
				public String Email;
				public String Password;
				
				private Line_data(String email, String Passwd) {
					this.Email = email;
					this.Password = Passwd;
				}
			}
			
			public enum GooglePlus_data {
				
				Google_Plus1("",""),
				Google_Plus2("","");
				
				public String Email;
				public String Password;
				
				private GooglePlus_data(String email, String Passwd) {
					this.Email = email;
					this.Password = Passwd;
				}
			}
			public enum TwitterUsernameLogin_data {
				
				TwitterUsername1("",""),
				TwitterUsername2("","");
				
				public String Username;
				public String Password;
				
				private TwitterUsernameLogin_data(String Uname, String Passwd) {
					this.Username = Uname;
					this.Password = Passwd;
				}
			}
			public enum TwitterEmailLogin_data {
				
				TwitterEmail1("",""),
				TwitterEmail2("","");
				
				public String Email;
				public String Password;
				
				private TwitterEmailLogin_data(String email, String Passwd) {
					this.Email = email;
					this.Password = Passwd;
				}
			}
			
			public enum Telegram_data {
				Telegram1("",""),
				Telegram2("","");
				
				public String PhoneNumber;
				public String OTP;
				
				private Telegram_data(String PhnNum, String otp) {
					this.PhoneNumber = PhnNum;
					this.OTP = otp;
				}
			}
			
			public enum TalkEmailLogin_data {
				TalkEmail1("",""),
				TalkEmail2("","");
				
				public String Email;
				public String Password;
				
				private TalkEmailLogin_data(String email, String Passwd) {
					this.Email = email;
					this.Password = Passwd;
				}
			}
			
			public enum TalkPhoneLogin_data {
				TalkPhone1("",""),
				TalkPhone2("","");
				
				public String PhoneNumber;
				public String Password;
				
				private TalkPhoneLogin_data(String PhnNum, String Passwd) {
					this.PhoneNumber = PhnNum;
					this.Password = Passwd;
				}
			}
}