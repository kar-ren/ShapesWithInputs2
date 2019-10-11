package com.shape.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
//import static org.mockito.Mockito.verify;

import com.shape.impl.Rectangle;
import com.shape.interfaces.Shape;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class RecTest {
	@Mock
	Shape sh;

	@InjectMocks
	Rectangle rec;

	@Test
	public void rectest() {
		when(sh.shape()).thenReturn(Shape.rectanglename);
		System.out.println(sh.shape());
		assertEquals(sh.shape(), Shape.rectanglename);
	}

	@Test
	public void rec1() {
		when(sh.findPerimeter(2, 11, 12.0)).thenReturn(46.0);
		System.out.println("The Primeter is " + sh.findPerimeter(2, 11, 12.0));
		Assert.assertEquals(sh.findPerimeter(2, 11, 12.0), 46.0);
	}

	@Test
	public void rec2() {
		when(sh.findArea(11, 12)).thenReturn(132.0);
		System.out.println("The Ares is " + sh.findArea(11,12));
		Assert.assertEquals(sh.findArea(11, 12), 132.0);
	}
}
