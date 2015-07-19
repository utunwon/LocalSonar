package com.maven.localsonar.simplecalculator;

public interface SimpleCalculator {
	int add(int ...numbers);
	int substract(int biggerNumber, int smallerNumber);
	int multiply(int ...numbers);
	int devide(int dividend, int devisor);
}
