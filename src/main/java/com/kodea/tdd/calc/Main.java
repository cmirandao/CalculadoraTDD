package com.kodea.tdd.calc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op="";
		double a,b;
		Scanner n = new Scanner(System.in);
		do{
			System.out.println("Ingrese operador (+, -, * o /)");
			op=n.next();
			if(!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")))
				System.out.println("Debe ingresar +, -, * o /");
		}
		while(!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")));
		
		System.out.println("Ingrese primer operando:");
		a=n.nextDouble();
		System.out.println("Ingrese segundo operando:");
		b=n.nextDouble();
		n.close();
		Calc c=new Calc();
		double result=0;
		try {
			switch(op){
			case "+":
				result=c.add(a, b);
				break;
			case "-":
				result=c.sub(a, b);
				break;
			case "/":
				result=c.divi(a, b);
				break;
			case "*":
				result=c.mul(a, b);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("El resultado es: " + result);
	}
}