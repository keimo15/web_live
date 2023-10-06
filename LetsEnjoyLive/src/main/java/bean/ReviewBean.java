package bean;

import java.io.Serializable;

public class ReviewBean implements Serializable {
	private String B_Name;
	private String B_Band;
	private String B_Song;
	private String B_Text;
	
	public void setName(String Name) {
		this.B_Name = Name;
	}
	public void setBand(String Band) {
		this.B_Band = Band;
	}
	public void setSong(String Song) {
		this.B_Song = Song;
	}
	public void setText(String Text) {
		this.B_Text = Text;
	}
	public String getName() {
		return B_Name;
	}
	public String getBand() {
		return B_Band;
	}
	public String getSong() {
		return B_Song;
	}
	public String getText() {
		return B_Text;
	}
}
