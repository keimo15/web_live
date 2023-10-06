package bean;

import java.io.Serializable;

public class BandBean implements Serializable {
	private String B_Band;
	private    int B_Debut;
	private String B_Song;
	private String[] B_Memb;
	private String[] B_Part;

// セッター
	public void setBand(String Band) {
		this.B_Band = Band;
	}
	public void setDebut(int Debut) {
		this.B_Debut = Debut;
	}
	public void setSong(String Song) {
		this.B_Song = Song;
	}
	public void setMemb(String[] Memb) {
		this.B_Memb = Memb;
	}
	public void setPart(String[] Part) {
		this.B_Part = Part;
	}
	
// ゲッター
	public String getBand() {
		return B_Band;
	}
	public int getDebut() {
		return B_Debut;
	}
	public String getSong() {
		return B_Song;
	}
	public String[] getMemb() {
		return B_Memb;
	}
	public String[] getPart() {
		return B_Part;
	}
}
