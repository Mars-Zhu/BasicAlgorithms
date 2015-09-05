package com.zhubicheng.util;

public class Interval {
	  public int start, end;
	  public Interval(int start, int end) {
	          this.start = start;
	          this.end = end;
      }
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = String.format("(%d, %d)\t", start,end);
	
		return s;
	}
}
