package com.vamshi.sp07;

import java.util.Arrays;
import java.util.List;

public class Student {
	private int marks[];
	//private List<String> names;
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	//public void setNames(List<String> names) {
	//	this.names = names;
	//}
	@Override
	public String toString() {
		return "Student [market="+Arrays.toString(marks);
}
}
