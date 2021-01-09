package com.cg.LABBOOK2;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class EXERCISE1Test
{
    /**
     * Rigorous Test :-)
     * 
     */
	private EXERCISE1 smallest;
	@Before
	public void setup() {
		smallest = new EXERCISE1();
	}
	
	@Test
	public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReurn0AsInteger() {
	    int  newNumbers[]= {};
		int result=  smallest.getSecondSmallest(newNumbers);
		  assertEquals(0, result);
		  
		}
	
	@Test
	public void test_getSecondSmallest_Given1IntegerArray_ShouldReurn1AsInteger() {
    int  newNumbers[]= {1};
	int result=  smallest.getSecondSmallest(newNumbers);
	  assertEquals(1, result);
	  
	}
	@Test
	public void test_getSecondSmallest_Given2IntegerArray_ShouldReurn1AsInteger() {
    int  newNumbers[]= {1,2};
	int result=  smallest.getSecondSmallest(newNumbers);
	  assertEquals(2, result);
	  
	}
	@Test
	public void test_getSecondSmallest_Given3IntegerArray_ShouldReurn1AsInteger() {
    int  newNumbers[]= {2,1,3};
	int result=  smallest.getSecondSmallest(newNumbers);
	  assertEquals(2, result);
	}
	  @Test
		public void test_getSecondSmallest_Given5IntegerArray_ShouldReurn1AsInteger() {
	    int  newNumbers[]= {5,4,3,6,8};
		int result=  smallest.getSecondSmallest(newNumbers);
		  assertEquals(4, result);
	  }
	}