package com.mini.impl;

import com.mini.Multiple;

public class MultipleImpl implements Multiple{

	@Override
	public String genFizz(int num) {
		if(num % 3 == 0){
			return "Fizz";
		}
		return "";

	}

	@Override
	public String genBuzz(int num) {
		if(num % 5 == 0){
			return "Buzz";
		}
		return "";
	}

}
