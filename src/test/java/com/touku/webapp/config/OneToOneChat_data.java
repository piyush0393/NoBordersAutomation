package com.touku.webapp.config;

public class OneToOneChat_data {

	public enum OneToOneChatSearch_data {
		
		ChatSearch1(""),
		ChatSearch2(""),
		ChatSearch3("");
		
		public String ChatSearch;
		
		private OneToOneChatSearch_data(String search) {
			this.ChatSearch = search;
		}
	}
	
	public enum ChatEnterMsg {
		
		ChatEnterMsg1(""),
		ChatEnterMsg2(""),
		ChatEnterMsg3("");
		
		public String ChatEnterMsg;
		
		private ChatEnterMsg(String EnterMsg) {
			this.ChatEnterMsg = EnterMsg;
		}
	}
}
