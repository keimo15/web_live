package bean;

import java.io.Serializable;

public class PlaceBean implements Serializable {
	private String B_Name;
	private String B_Area;
	private int    B_Capa;
	private String B_Stat;
	
	public void setName(String Name) {
		this.B_Name = Name;
	}
	public void setArea(String Area) {
		this.B_Area = Area;
	}
	public void setCapa(int Capa) {
		this.B_Capa = Capa;
	}
	public void setStat(String Stat) {
		this.B_Stat = Stat;
	}
	public String getName() {
		return B_Name;
	}
	public String getArea() {
		return B_Area;
	}
	public int getCapa() {
		return B_Capa;
	}
	public String getStat() {
		return B_Stat;
	}
}
