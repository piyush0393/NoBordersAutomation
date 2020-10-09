package com.touku.webapp.config;

public class Messages_data {

	public enum Message_data {
		
		ComposeMsg1(""),
		ComposeMsg2(""),
		ComposeMsg3(""),
		ComposeMsg4("");
		
		public String Message;
		
		private Message_data(String Msg) {
			this.Message = Msg;
		}
	}
	
	public enum ScheduleDateFilter_data {
	
		ScheduleDateFilter1("04012020","08012020"),
		ScheduleDateFilter2("",""),
		ScheduleDateFilter3("","");
		
		public String FromDate;
		public String ToDate;
		
		private ScheduleDateFilter_data(String Frmdate, String Todate) {
			this.FromDate = Frmdate;
			this.ToDate = Todate;
		}
	}
	
	public enum DraftsDateFilter_data {
		
		DraftsDateFilter1("",""),
		DraftsDateFilter2("",""),
		DraftsDateFilter3("","");
		
		public String FromDate;
		public String ToDate;
		
		private DraftsDateFilter_data(String Frmdate, String Todate) {
			this.FromDate = Frmdate;
			this.ToDate = Todate;
		}
	}
	
	public enum SentDateFilter_data {
		
		SentDateFilter1("",""),
		SentDateFilter2("",""),
		SentDateFilter3("","");
		
		public String FromDate;
		public String ToDate;
		
		private SentDateFilter_data(String Frmdate, String Todate) {
			this.FromDate = Frmdate;
			this.ToDate = Todate;
		}
	}
}
