package com.touku.webapp.config;

public class GeneralHome_data {

	public enum SearchChatMember_data {
		
		SearchChatMember1(""),
		SearchChatMember2(""),
		SearchChatMember3("");
		
		public String SearchChatMember;
		
		private SearchChatMember_data(String MemberName) {
			this.SearchChatMember = MemberName;
			
		}
	}
	
	public enum ProfileEditDisplayName {
		
		EditDisplayName1(""),
		EditDisplayName2(""),
		EditDisplayName3("");
		
		public String DisplayName;
		
		private ProfileEditDisplayName(String displayName) {
			this.DisplayName =displayName;
		}
	}
	
	public enum ProfileEditChangePassword {
		
		EditChangePassword1("","",""),
		EditChangePassword2("","",""),
		EditChangePassword3("","","");
		
		public String OldPassword;
		public String NewPassword;
		public String ConfirmPassword;
		
		private ProfileEditChangePassword(String OldPasswd, String NewPasswd, String ConfirmPasswd) {
			this.OldPassword = OldPasswd;
			this.NewPassword = NewPasswd;
			this.ConfirmPassword = ConfirmPasswd;
		}
	}
	
	
	public enum ProfileEditChangeEmail {
		
		EditEmail1("","",""),
		EditEmail2("","",""),
		EditEmail3("","","");
		
		public String NewEmail;
		public String OldVerCode;
		public String NewVerCode;
		
		private ProfileEditChangeEmail(String newEmail, String oldVerCode, String newVerCode) {
			
		}
	}
	
	public enum CreateGroupChat {
		
		CreateGroupChat1("","",""),
		CreateGroupChat2("","",""),
		CreateGroupChat3("","","");
		
		public String GroupName;
		public String Note;
		public String SearchName;
		
		private CreateGroupChat(String groupName, String note, String searchName) {
			this.GroupName = groupName;
			this.Note = note;
			this.SearchName = searchName;
		}
	}
	
	public enum CreateChannel_data {
		
		CreateChannel1("","","",""),
		CreateChannel2("","","",""),
		CreateChannel3("","","","");
		
		public String ChannelName;
		public String ChannelStatus;
		public String SearchName;
		public String AboutText;
		
		private CreateChannel_data(String channelName, String channelStatus, String searchName, String aboutText) {
			
			this.ChannelName = channelName;
			this.ChannelStatus = channelStatus;
			this.SearchName = searchName;
			this.AboutText = aboutText;
			
		}
	}
	
	public enum AddFriendSearch_data {
		
		AddFriend1(""),
		AddFriend2(""),
		AddFriend3(""),
		AddFriend4("");
		
		public String SearchFriendName;
		
		private AddFriendSearch_data(String FriendName) {
			this.SearchFriendName = FriendName;
		}
	}
	
	public enum SendGroupMsg {
		
		GroupMsg1(""),
		GroupMsg2(""),
		GroupMsg3("");
		
		public String Message;
		
		private SendGroupMsg(String msg) {
			this.Message = msg;
		}
		
		
	}
	
	public enum SendFriendMsg {
		
		FriendMsg1(""),
		FriendMsg2(""),
		FriendMsg3("");
		
		public String Message;
		
		private SendFriendMsg(String msg) {
			this.Message = msg;
		}
		
		
	}

	public enum SendChannelMsg {
	
		ChannelMsg1(""),
		ChannelMsg2(""),
		ChannelMsg3("");
		
		public String Message;
		
		private SendChannelMsg(String msg) {
			this.Message = msg;
		}
		
		
	}
}
