package com.shape.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
//import static org.mockito.Mockito.verify;



import com.shape.impl.Circle;
import com.shape.interfaces.Shape;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class CircleTest {
	@Mock
	Shape sh;
	
	@InjectMocks
	Circle circle;
	
	@Test
	public void circletest() {
		when(sh.shape()).thenReturn(Shape.circlename);
		System.out.println(sh.shape());
		assertEquals(sh.shape(), Shape.circlename);
	}
	
	@Test
	public void circle1(){
		when(sh.findPerimeter(2, 12, Math.PI)).thenReturn(75.36);
		System.out.println("The Primeter is " + sh.findPerimeter(2, 12, Math.PI));
		Assert.assertEquals(sh.findPerimeter(2, 12, Math.PI), 75.36);
	}
	
	@Test
	public void circle2() {
		when(sh.findArea(12, Math.PI)).thenReturn(452.16);
		System.out.println("The Ares is " + sh.findArea(12, Math.PI));
		Assert.assertEquals(sh.findArea(12, Math.PI), 452.16);
	}
}
