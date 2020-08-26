package com.touku.webapp.config;

public class Setting_data {

	public enum EditChannelName_data {
		
		ChannelName1(""),
		ChannelName2(""),
		ChannelName3("");
		
		public String ChannelName;
		
		private EditChannelName_data(String channelName) {
			this.ChannelName = channelName;
		}
	}
	
	public enum EditChannelStatus_data {
		
		ChannelStatus1(""),
		ChannelStatus2(""),
		ChannelStatus3("");
		
		public String ChannelStatus;
		
		private EditChannelStatus_data(String channelStatus) {
			this.ChannelStatus = channelStatus;
		}
	}
	
	public enum EditChannelAbout_data {
		
		ChannelAbout1(""),
		ChannelAbout2(""),
		ChannelAbout3("");
		
		public String ChannelAbout;
		
		private EditChannelAbout_data(String channelAbout) {
			this.ChannelAbout = channelAbout;
		}
	}
	
	public enum SearchChannelMember {
		
		SearchMemberName1(""),
		SearchMemberName2(""),
		SearchMemberName3("");
		
		public String SearchMemberName;
		
		private SearchChannelMember(String MemberName) {
			this.SearchMemberName = MemberName;
			
		}
	}
}
