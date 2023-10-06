package bean;

import java.io.Serializable;
import java.util.ArrayList;

public class LiveDTO implements Serializable {
	private ArrayList<LiveBean> list;
	
	public LiveDTO() {
		list = new ArrayList<LiveBean>();
	}
	public void add(LiveBean lb) {
		list.add(lb);
	}
	public LiveBean get(int i) {
		return list.get(i);
	}
	public int size() {
		return list.size();
	}
}
