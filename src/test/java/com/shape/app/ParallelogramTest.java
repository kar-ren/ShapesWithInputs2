package com.shape.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

import com.shape.impl.Parallelogram;
import com.shape.interfaces.Shape;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class ParallelogramTest {
	
	@Mock
	Shape s;
	
	@InjectMocks
	Parallelogram parallel;
	
	@Test
	public void paraTest() {
		when(s.shape()).thenReturn(Shape.parallelogramname);
		System.out.println(s.shape());
		assertEquals(s.shape(), Shape.parallelogramname);
	}
	
	@Test
	public void parPerimeter() {
		when(s.findPerimeter(11, 12, 2)).thenReturn(46.0);
		System.out.println("The Perimeter is " + s.findPerimeter(11, 12, 2));
		Assert.assertEquals(s.findPerimeter(11, 12, 2), 46.0);
	}
	
	@Test
	public void parArea() {
		when(s.findArea(11, 9.0)).thenReturn(99.0);
		System.out.println("The Area is " + s.findArea(11, 9.0));
		Assert.assertEquals(s.findArea(11, 9.0), 99.0);
	}
}
