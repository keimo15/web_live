package bean;

import java.io.Serializable;
import java.util.ArrayList;

public class PlaceDTO implements Serializable {
	private ArrayList<PlaceBean> list;
	
	public PlaceDTO() {
		list = new ArrayList<PlaceBean>();
	}
	public void add(PlaceBean pb) {
		list.add(pb);
	}
	public PlaceBean get(int i) {
		return list.get(i);
	}
	public int size() {
		return list.size();
	}
}
