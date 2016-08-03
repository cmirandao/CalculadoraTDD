package com.kodea.tdd.calc;

public class Calc {

	public double add(double val1, double val2) {
		// TODO Auto-generated method stub
		return val1+val2;
	}

	public double sub(double val1, double val2) {
		// TODO Auto-generated method stub		
		return val1-val2;
	}

	public double mul(double val1, double val2) {
		// TODO Auto-generated method stub	
		return val1*val2;
	}

	public double divi(double val1, double val2) throws ArithmeticException {
		// TODO Auto-generated method stub
		if(val2!=0)
			return val1/val2;
		else
			throw new ArithmeticException("No puede dividir por 0");
	}
}