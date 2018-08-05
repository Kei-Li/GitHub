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

public class CalculationPrintWordTest {  
  
    private int input;  
    private String expected;  
      
    @Parameters  
    public static Collection prepareData(){  
        Object [][] object = {
        		{1,"1"},
        		{3,"Fizz"},
        		{5,"Buzz"},
        		{15,"FizzBuzz"}
        		
        };  
        return Arrays.asList(object);  
    }  
      
    public CalculationPrintWordTest(int input, String expected){  
        this.input = input;  
        this.expected = expected;  
    }  
    
    @Test  
    public void testPrintWord(){  
    	Calculation cl = new Calculation();  
        String result = cl.printWord(input); 
        Assert.assertEquals(expected,result);  
    }  
}
