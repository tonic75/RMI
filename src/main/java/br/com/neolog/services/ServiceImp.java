package br.com.neolog.services;

import org.springframework.stereotype.Component;

@Component
public class ServiceImp implements Service{

	public synchronized boolean isCreditOk(String cardNumber) {
		try {
			wait(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public synchronized boolean isDebtOk(String agency, String account) {
		try {
			wait(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
}
