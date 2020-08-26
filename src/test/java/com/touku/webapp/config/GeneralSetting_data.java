package com.touku.webapp.config;

public class GeneralSetting_data {

	public enum SupportChatMessage {
		
		SuppChatMessage1(""),
		SuppChatMessage2(""),
		SuppChatMessage3("");
		
		public String SuppChatMessage;
		
		private SupportChatMessage(String suppMessage) {
			this.SuppChatMessage = suppMessage;
		}
	}

	
	public enum SearchFriend_data {
		SearchFriend1(""),
		SearchFriend2(""),
		SearchFriend3("");
		
		public String SearchString;
		
		private SearchFriend_data(String searchString) {
			this.SearchString = searchString;
		}
	}
	
	public enum CreateGroupChat_GroupName_data {
		GroupName1(""),
		GroupName2(""),
		GroupName3("");
		
		public String GroupName;
		
		private CreateGroupChat_GroupName_data(String groupName) {
			this.GroupName = groupName;
		}
	}
	
	public enum CreateGroupChat_GroupNote_data {
		GroupNote1(""),
		GroupNote2(""),
		GroupNote3("");
		
		public String GroupNote;
		
		private CreateGroupChat_GroupNote_data(String groupNote) {
			this.GroupNote = groupNote;
		}
	}
	
	public enum CreateGroupChat_GroupSearch_data {
		GroupSearch1(""),
		GroupSearch2(""),
		GroupSearch3("");
		
		public String GroupSearchName;
		
		private CreateGroupChat_GroupSearch_data(String groupSearchName) {
			this.GroupSearchName = groupSearchName;
		}
	}
	
	public enum CreateChannel_ChannelName {
		ChannelName1(""),
		ChannelName2(""),
		ChannelName3("");
		
		public String ChannelName;
		
		private CreateChannel_ChannelName(String channelName) {
			this.ChannelName = channelName;
		}
	}
	
	public enum CreateChannel_ChannelStatus {
		ChannelStatus1(""),
		ChannelStatus2(""),
		ChannelStatus3("");
		
		public String ChannelStatus;
		
		private CreateChannel_ChannelStatus(String channelStatus) {
			this.ChannelStatus = channelStatus;
		}
	}
	
	public enum CreateChannel_About {
		AboutText1(""),
		AboutText2(""),
		AboutText3("");
		
		public String ChannelAbout;
		
		private CreateChannel_About(String channelAbout) {
			this.ChannelAbout = channelAbout;
		}
	}
	
	public enum CreateChannel_SearchText {
		SearchText1(""),
		SearchText2(""),
		SearchText3("");
		
		public String SearchText;
		
		private CreateChannel_SearchText(String searchText) {
			this.SearchText = searchText;
		}
	}
	
	public enum CreateChannel_VIPFeatureData {
		VIP1(""),
		VIP2(""),
		VIP3("");
		
		public String VIPData;
		
		private CreateChannel_VIPFeatureData(String vipData) {
			this.VIPData = vipData;
		}
	}
	
	
	public enum EditProfile_EditUsername {
		Username1(""),
		Username2(""),
		Username3("");
		
		public String UserName;
		
		private EditProfile_EditUsername(String username) {
			this.UserName = username;
		}
	}
	
	public enum EditProfile_EditPassword_OldPassword {
		OldPassword1(""),
		OldPassword2(""),
		OldPassword3("");
		
		public String OldPasswd;
		
		private EditProfile_EditPassword_OldPassword(String oldpasswd) {
			this.OldPasswd = oldpasswd;
		}
	}
	
	public enum EditProfile_EditPassword_NewPassword {
		NewPassword1(""),
		NewPassword2(""),
		NewPassword3("");
		
		public String NewPasswd;
		
		private EditProfile_EditPassword_NewPassword(String newpasswd) {
			this.NewPasswd = newpasswd;
		}
	}
	
	public enum EditProfile_EditPassword_CNFPassword {
		CNFPassword1(""),
		CNFPassword2(""),
		CNFPassword3("");
		
		public String CNFPasswd;
		
		private EditProfile_EditPassword_CNFPassword(String CNFpasswd) {
			this.CNFPasswd = CNFpasswd;
		}
	}
	
	public enum EditProfile_ChangeEmail_NewEmail {
		NewEmail1(""),
		NewEmail2(""),
		NewEmail3("");
		
		public String NewEmail;
		
		private EditProfile_ChangeEmail_NewEmail(String newEmail) {
			this.NewEmail = newEmail;
		}
	}
	
	public enum EditProfile_ChangeEmail_OldVerCode {
		OldVerCode1(""),
		OldVerCode2(""),
		OldVerCode3("");
		
		public String OldVerCode;
		
		private EditProfile_ChangeEmail_OldVerCode(String oldVerCode) {
			this.OldVerCode = oldVerCode;
		}
	}
	
	public enum EditProfile_ChangeEmail_NewVerCode {
		
		NewVerCode1(""),
		NewVerCode2(""),
		NewVerCode3("");
		
		public String NewVerCode;
		
		private EditProfile_ChangeEmail_NewVerCode(String newVerCode) {
			this.NewVerCode = newVerCode;
		}
	}
	
	
}
