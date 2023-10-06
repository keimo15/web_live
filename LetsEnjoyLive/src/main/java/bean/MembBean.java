package bean;

import java.io.Serializable;

public class MembBean implements Serializable {
	private String B_Name;
	private String B_Band;
	private String B_Part;
	
	public void setName(String Name) {
		this.B_Name = Name;
	}
	public void setBand(String Band) {
		this.B_Band = Band;
	}
	public void setPart(String Part) {
		this.B_Part = Part;
	}
	public String getName() {
		return B_Name;
	}
	public String getBand() {
		return B_Band;
	}
	public String getPart() {
		return B_Part;
	}
}
