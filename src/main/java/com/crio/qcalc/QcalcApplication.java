package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
//git pull ME_QCALC_V2_MODULE_OOP_STUB master --allow-unrelated-histories --no-import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Hello world");
		StandardCalculator calc = new StandardCalculator();
		calc.add(1, 1);
		calc.printResult();
		calc.subtract(5,2);
		calc.printResult();
		calc.multiply(4,2);
		calc.printResult();
		calc.divide(16,4);
		calc.printResult();
		calc.add(Double.MAX_VALUE , Double.MAX_VALUE);
		calc.printResult();
		calc.subtract(Double.MAX_VALUE, Double.MIN_VALUE);
		calc.printResult();
	}
}
