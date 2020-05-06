package com.intiformation.jenkins.demo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author JF
 *
 */
public class CalculatriceTest {

	@Test
	public void testAdd() {
		Calculatrice cal = new Calculatrice();
		assertEquals("Est ce que l'addition est correct", 10, cal.add(5, 5));
	}

	@Test
	public void testMul() {
		Calculatrice cal = new Calculatrice();
		assertEquals("Est ce que la multiplication est correct", 25, cal.mul(5, 2));
	}

}
