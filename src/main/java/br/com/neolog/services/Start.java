package br.com.neolog.services;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	@SuppressWarnings("unused")
	private static final ApplicationContext contextoPrincipal = new ClassPathXmlApplicationContext("META-INF/beans.xml");
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Press any key to stop the Credit Card Service");
		kb.next();
	}

}
