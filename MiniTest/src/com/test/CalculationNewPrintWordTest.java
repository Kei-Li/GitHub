package com.test;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.minitest.Calculation;  
@RunWith(Parameterized.class)  

public class CalculationNewPrintWordTest {  
  
    private int input;  
    private String expected;  
      
    @Parameters  
    public static Collection prepareData(){  
        Object [][] object = {
        		{1,"1"},
        		{3,"Fizz"},
        		{5,"Buzz"},
        		{13,"Fizz"},
        		{15,"FizzBuzz"},
        		{52,"Buzz"},
        		{53,"FizzBuzz"},
        };  
        return Arrays.asList(object);  
    }  
      
    public CalculationNewPrintWordTest(int input, String expected){  
        this.input = input;  
        this.expected = expected;  
    }  
    @Test  
    public void testNewPrintWord(){  
    	Calculation cl = new Calculation();  
        String result = cl.newPrintWord(input); 
        Assert.assertEquals(expected,result);  
    }
}
