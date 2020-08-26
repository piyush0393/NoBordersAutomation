package com.touku.webapp.config;

public class OneToOneChatFollower_data {

	public enum OneToOneChatFollower {
		
		FollowerSearch1(""),
		FollowerSearch2("");
		
		public String FollowerSearch;
		
		private OneToOneChatFollower(String search) {
			this.FollowerSearch = search;
		}
	}
	
    public enum FollowerEnterMsg {
		
		FollowerEnterMsg1(""),
		FollowerEnterMsg2(""),
		FollowerEnterMsg3("");
		
		public String FollowerEnterMsg;
		
		private FollowerEnterMsg(String EnterMsg) {
			this.FollowerEnterMsg = EnterMsg;
		}
	}
}
