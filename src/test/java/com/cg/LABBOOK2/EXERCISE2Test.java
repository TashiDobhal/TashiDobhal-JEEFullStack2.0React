package com.cg.LABBOOK2;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EXERCISE2Test {
	private EXERCISE2 exercise;
	@Before
	public void setup() {
		exercise = new EXERCISE2();
	}
	@Test
	public void sortString_whenCalled_ShouldReturnExpectedResult() {
	    String a = "tashi";
		String result=  exercise.sortString(a);
		  assertEquals("AHIst", result);
		  
		}
	
	@Test
	public void sortString_whenCalled_ShouldReturnEmptyString() {
	    String a = "";
		String result=  exercise.sortString(a);
		  assertEquals("", result);
		  
		}
	
	
	
}
