package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Hello world");
		StandardCalculator calc = new StandardCalculator();
		calc.add(1, 1);
		calc.substract(4,2);
		calc.multiply(4,2);
		calc.divide(8,4);
		calc.clearResult();
		calc.printResult();

		System.out.println(calc.getResult());

	}

}
