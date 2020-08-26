package com.touku.webapp.config;

public class Attachment_data {

	public enum AddAudio_data {
	
		Audio1("",""),
		Audio2("",""),
		Audio3("","");
		
		public String AudioName;
		public String AudioURL;
		
		private AddAudio_data(String name, String url) {
			
			this.AudioName = name;
			this.AudioURL = url;
		}
		
	}
	
	public enum AddPhoto_data {
		
		Photo1("",""),
		Photo2("",""),
		Photo3("","");
		
		public String PhotoName;
		public String PhotoURL;
		
		private AddPhoto_data(String name, String url) {
			
			this.PhotoName = name;
			this.PhotoURL = url;
		}
	}
	
	public enum AddVideo_data {
		
		Video1("",""),
		Video2("",""),
		Video3("","");
		
		public String VideoName;
		public String VideoURL;
		
		private AddVideo_data(String name, String url) {
			
			this.VideoName = name;
			this.VideoURL = url;
		}
	}
}
