package com.qa.ExampleCIProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogicTest {
	
	@Test
	public void playTest() {
		
		assertEquals(10,Logic.play(10,10));
		
	}

}
