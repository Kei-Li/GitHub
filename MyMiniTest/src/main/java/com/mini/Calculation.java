package com.mini;

import com.mini.impl.MultipleImpl;
import com.mini.impl.NewMultipleImpl;

public class Calculation {
	public String printWord (int num) {
		Multiple mup  = new MultipleImpl();
		String rs = mup.genFizz(num) + mup.genBuzz(num);
		if(rs.length() > 0){
			return rs;
		} 
		return num+"";
	}
	public String newPrintWord (int num) {
		Multiple mup  = new NewMultipleImpl();
		String rs = mup.genFizz(num) + mup.genBuzz(num);
		if(rs.length() > 0){
			return rs;
		} 
		return num+"";
	}
}
