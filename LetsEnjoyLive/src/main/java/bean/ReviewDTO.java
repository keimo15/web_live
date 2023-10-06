package bean;

import java.io.Serializable;
import java.util.ArrayList;

public class ReviewDTO implements Serializable {
	private ArrayList<ReviewBean> list;
	
	public ReviewDTO() {
		list = new ArrayList<ReviewBean>();
	}
	public void add(ReviewBean rb) {
		list.add(rb);
	}
	public ReviewBean get(int i) {
		return list.get(i);
	}
	public int size() {
		return list.size();
	}
}
