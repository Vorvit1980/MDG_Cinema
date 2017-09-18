package dev.barmaglot.com.mdg_cinema;

import android.text.format.Time;

import java.util.ArrayList;
import java.util.List;

public class Group {

	public String Name;
	public Time time;

	public List<Item> GroupItemCollection;

	public Group() {
		GroupItemCollection = new ArrayList<Item>();
	}

	public class Item {
		public String Name;
		public Time time;
	}
}
