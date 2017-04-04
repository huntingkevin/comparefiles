package com.myapp.comparefiles.domain;

import java.util.HashMap;

public class ExamResult {
	
	HashMap<Long, String> map = new HashMap<Long, String>();
	
	private long key;
 
    private String column2;
 
    private int column3;
    
    public long getKey() {
		return key;
	}

	public void setColumn1(long key) {
		this.key = key;
	}

	public String getColumn2() {
		return column2;
	}

	public void setColumn2(String column2) {
		this.column2 = column2;
	}

	public int getColumn3() {
		return column3;
	}

	public void setColumn3(int column3) {
		this.column3 = column3;
	}



   
 
//    @Override
//    public String toString() {
//        return "ExamResult [studentName=" + studentName + ", dob=" + dob
//                + ", percentage=" + percentage + "]";
//    }
 
}
