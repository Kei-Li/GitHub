package com.minitest.impl;

import com.minitest.Multiple;

public class NewMultipleImpl implements Multiple{

	@Override
	public String genFizz(int num) {
		if(num % 3 == 0 || (num+"").indexOf("3") >-1){
			return "Fizz";
		}
		return "";

	}

	@Override
	public String genBuzz(int num) {
		if(num % 5 == 0 || (num+"").indexOf("5") >-1){
			return "Buzz";
		}
		return "";
	}

}
