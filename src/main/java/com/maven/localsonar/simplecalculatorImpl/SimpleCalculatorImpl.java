package com.maven.localsonar.simplecalculatorImpl;

import com.maven.localsonar.simplecalculator.SimpleCalculator;

public class SimpleCalculatorImpl implements SimpleCalculator {
	private SimpleCalculatorImpl() {}
	
	public static SimpleCalculator getSimpleCalculator(){
		return new SimpleCalculatorImpl();	
	}

	public int add(int... numbers) {
		int total=0;
		for(int number : numbers){
			total+=number;
		}
		return total;
	}

	public int substract(int biggerNumber, int smallerNumber) {
		return biggerNumber-smallerNumber;
	}

	public int multiply(int... numbers) {
		int result=1;
		for(int number : numbers){
			result*=number;
		}
		return result;
	}

	public int devide(int dividend, int devisor) {
		return dividend/devisor;
	}

}
