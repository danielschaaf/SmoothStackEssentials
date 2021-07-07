package com.ss.ds.jb.four.Tests;

import org.junit.Assert;
import org.junit.Test;

import com.ss.ds.jb.four.Line;




public class LineTests {
	

	@Test
	public void getSlopeTest() {
		Line a = new Line(4,14,8,16);
		
		Assert.assertEquals(.5, a.getSlope(),.001);
		
	}
	
	@Test
	public void getDistance() {
		Line a = new Line(4,14,8,16);
		
		Assert.assertEquals(4.472, a.getDistance(),.001);
		
	}
	
	@Test
	public void parallelTo() {
		Line b = new Line(2,5,4,6);
		Line a = new Line(4,14,8,16);
		
		Assert.assertTrue(a.parallelTo(b));
		
	}
	
}
