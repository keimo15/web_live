package bean;

import java.io.Serializable;
import java.util.ArrayList;

public class BandDTO implements Serializable {
	private ArrayList<BandBean> list;
	
	public BandDTO() {
		list = new ArrayList<BandBean>();
	}
	public void add(BandBean bb) {
		list.add(bb);
	}
	public BandBean get(int i) {
		return list.get(i);
	}
	public int size() {
		return list.size();
	}
}
