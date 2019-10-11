package com.shape.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.shape.impl.Square;
import com.shape.interfaces.Shape;

import junit.framework.Assert;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SquareTest {
	@Mock
	Shape sh;

	@InjectMocks
	Square sq;

	@Test
	public void rectest() {
		when(sh.shape()).thenReturn(Shape.squarename);
		System.out.println(sh.shape());
		assertEquals(sh.shape(), Shape.squarename);
	}

	@Test
	public void square1() {
		when(sh.findPerimeter(10, 4, 0)).thenReturn(40.0);
		System.out.println("The Primeter is " + sh.findPerimeter(10, 4, 0));
		Assert.assertEquals(sh.findPerimeter(10, 4, 0), 40.0);
	}

	@Test
	public void square2() {
		when(sh.findArea(10, 2)).thenReturn(132.0);
		System.out.println("The Ares is " + sh.findArea(10, 2));
		Assert.assertEquals(sh.findArea(10, 2.0), 100.0);
	}
}
