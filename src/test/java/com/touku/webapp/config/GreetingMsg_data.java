package com.touku.webapp.config;

public class GreetingMsg_data {

	public enum GreetingMsgdata {
		
		GreetingMsg1(""),
		GreetingMsg2(""),
		GreetingMsg3("");
		
		public String GreetingMsg;
		
		private GreetingMsgdata(String msg) {
			this.GreetingMsg = msg;
		}
	}
}
