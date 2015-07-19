package com.maven.localsonar.somplecalculatortest;

import static org.junit.Assert.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

import com.maven.localsonar.simplecalculator.SimpleCalculator;
import com.maven.localsonar.simplecalculatorImpl.SimpleCalculatorImpl;

public class SimpleCalculatorTest {
	Logger logger=LoggerFactory.getLogger(SimpleCalculatorTest.class);
	SimpleCalculator calculator=SimpleCalculatorImpl.getSimpleCalculator();
	
	@Test
	public void add() {
		logger.info("add()");
		assertEquals(220, calculator.add(111, 109));
	}
	@Test
	public void substrct() {
		logger.info("substract()");
		assertEquals(15, calculator.substract(30, 15));
	}
	@Test
	public void multiply() {
		logger.info("multiply()");
		assertEquals(20, calculator.multiply(10, 2));
	}
	@Test
	public void devide() {
		logger.info("devide()");
		assertEquals(4, calculator.devide(20, 5));
	}
}
