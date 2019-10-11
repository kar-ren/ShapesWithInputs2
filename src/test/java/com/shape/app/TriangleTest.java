package com.shape.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.shape.impl.Triangle;
import com.shape.interfaces.Shape;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class TriangleTest {
	@Mock
	Shape sh;

	@InjectMocks
	Triangle tri;

	@Test
	public void rectest() {
		when(sh.shape()).thenReturn(Shape.trianglename);
		System.out.println(sh.shape());
		assertEquals(sh.shape(), Shape.trianglename);
	}

	@Test
	public void rec1() {
		when(sh.findPerimeter(10, 11, 12.0)).thenReturn(33.0);
		System.out.println("The Primeter is " + sh.findPerimeter(10, 11, 12.0));
		Assert.assertEquals(sh.findPerimeter(10, 11, 12.0), 33.0);
	}

	@Test
	public void rec2() {
		when(sh.findArea(10, 12)).thenReturn(60.0);
		System.out.println("The Ares is " + sh.findArea(10,12));
		Assert.assertEquals(sh.findArea(10, 12), 60.0);
	}
}
