package com.shape.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.shape.impl.Sphere;
import com.shape.interfaces.Shape;

import junit.framework.Assert;

//import junit.framework.Assert;

//import junit.framework.Assert;
@RunWith(MockitoJUnitRunner.class)
public class SphereTest {
	@Mock
	Shape sha;
	
	@InjectMocks
	Sphere sphere;
	
	@Test
	public void spheretest() {
		//sha = new Sphere();
		when(sha.shape()).thenReturn(Shape.spherename);
		System.out.println(Shape.spherename);
		assertEquals(sha.shape(), Shape.spherename);
//		when(sha.shape()).thenReturn(Shape.spherename);
//		System.out.println(sha.shape());
//		Assert.assertEquals(sha.shape(), Shape.spherename);
	}
	
	@Test
	public void sphere1(){
		when(sha.findPerimeter(2, 11, Math.PI)).thenReturn(69.11503837897544);
		System.out.println("The Primeter is " + sha.findPerimeter(2, 11, Math.PI));
		Assert.assertEquals(sha.findPerimeter(2, 11, Math.PI), 69.11503837897544);
	}
	
	@Test
	public void sphere2() {
		when(sha.findArea(11, Math.PI)).thenReturn(1520.53084433746);
		System.out.println("The Area is " + sha.findArea(12, Math.PI));
		Assert.assertEquals(sha.findArea(11, Math.PI), 1520.53084433746);
	}
}
