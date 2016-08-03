package com.kodea.tdd.calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalcTest {
	@Test
	public void checkInstance(){
		//arrange
		Calc calc;
		//act
		calc=new Calc();
		//assert
		assertNotNull(calc);
	}
	@Test
	public void checkAddTwoIntegers(){
		//arrange
		Calc calc;
		//act
		calc=new Calc();
		int val1=1;
		int val2=20;
		double result=calc.add(val1,val2);
		//assert
		assertEquals(21,result,0.1);
	}
	@Test
	public void checkSubTwoIntegers(){
		//arrange
		Calc calc;
		//act
		calc=new Calc();
		int val1=20;
		int val2=10;
		double result=calc.sub(val1,val2);
		//assert
		assertEquals(10,result,0.1);
	}
	@Test
	public void checkMulTwoIntegers(){
		//arrange
		Calc calc;
		//act
		calc=new Calc();
		int val1=2;
		int val2=10;
		double result=calc.mul(val1,val2);
		//assert
		assertEquals(20,result,0.1);
	}
	@Test
	public void checkDiviTwoIntegers(){
		//arrange
		Calc calc;
		//act
		calc=new Calc();
		int val1=20;
		int val2=10;
		double result=calc.divi(val1,val2);
		//assert
		assertEquals(2,result,0.1);
	}
	@Test(expected=ArithmeticException.class)
	public void checkDivideByZero(){
		Calc calc;
		calc=new Calc();
		int val1=20;
		int val2=0;
		calc.divi(val1,val2);
	}
}