package bean;

import java.io.Serializable;
import java.util.ArrayList;

public class MembDTO implements Serializable {
	private ArrayList<MembBean> list;
	
	public MembDTO() {
		list = new ArrayList<MembBean>();
	}
	public void add(MembBean mb) {
		list.add(mb);
	}
	public MembBean get(int i) {
		return list.get(i);
	}
	public int size() {
		return list.size();
	}
}
