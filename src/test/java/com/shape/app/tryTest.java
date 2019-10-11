package com.shape.app;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

//import com.shape.impl.Circle;
import com.shape.interfaces.Foo;



/**
 * Unit test for simple App.
 */


public class tryTest{
	
//	@Mock
//	Shape shapes;
	
	@Test
	public void testCircle() {
		Foo shapes = mock(Foo.class);
		when(shapes.greet()).thenReturn(shapes.Hello_world);
		System.out.println("Foo greets you: "+ shapes.greet());
		assertEquals(shapes.greet(), shapes.Hello_world);
	}
	
}