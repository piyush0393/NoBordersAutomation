package com.touku.webapp.config;

public class Scenarios_data {
	
	public enum ComposeScenario {
		
		Scenario1(""),
		Scenario2(""),
		Scenario3("");
		
		public String Scenario;
		
		private ComposeScenario(String scenario) {
			this.Scenario = scenario;
		}
	}

	public enum ScenarioHoursLater_data {
		
		HoursLater1(""),
		HoursLater2(""),
		HoursLater3("");
		
		public String HoursLater;
		
		private ScenarioHoursLater_data(String Hours) {
			this.HoursLater = Hours;
		}
	}
	
	public enum ScenarioStartDateTime_Recurring_data {
		
		StartDateTime_Recurring1("","",""),
		StartDateTime_Recurring2("","","");
		
		public String StartDate;
		public String StartHour;
		public String StartMinute;
		
		private ScenarioStartDateTime_Recurring_data(String startDate, String startHr, String startMin) {
			
			this.StartDate = startDate;
			this.StartHour = startHr;
			this.StartMinute = startMin;
		}
	}
	
	public enum ScenarioEndDate_Recurring {
		
		EndDate_Recurring1(""),
		EndDate_Recurring2("");
		
		public String EndDate;
		
		private ScenarioEndDate_Recurring(String endDate) {
			this.EndDate = endDate;
		}
	}
	
	public enum ScenarioNoOccurenceCount_Recurring_data {
		
		NoOccurenceCountRecurring1(""),
		NoOccurenceCountRecurring2("");
		
		public String Count;
		
		private ScenarioNoOccurenceCount_Recurring_data(String count) {
			
			this.Count = count;
		}
	}
}
