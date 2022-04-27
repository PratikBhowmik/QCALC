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
		System.out.println(calc.getResult());
		calc.subtract(5,2);
		System.out.println(calc.getResult());
		calc.multiply(4,2);
		System.out.println(calc.getResult());
		calc.divide(16,4);
		System.out.println(calc.getResult());
		calc.clearResult();
		calc.printResult();
	}
}
