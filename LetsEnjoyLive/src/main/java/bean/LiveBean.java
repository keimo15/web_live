package bean;

import java.io.Serializable;

public class LiveBean implements Serializable {
	private String B_Name;
	private String B_Band;
	private String B_Place;
	private java.sql.Date B_Date;
	
	public void setName(String Name) {
		this.B_Name = Name;
	}
	public void setBand(String Band) {
		this.B_Band = Band;
	}
	public void setPlace(String Place) {
		this.B_Place = Place;
	}
	public void setDate(java.sql.Date Date) {
		this.B_Date= Date;
	}
	public String getName() {
		return B_Name;
	}
	public String getBand() {
		return B_Band;
	}
	public String getPlace() {
		return B_Place;
	}
	public java.sql.Date getDate() {
		return B_Date;
	}
}
