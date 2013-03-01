package br.com.neolog.services;

public interface Service {
	public boolean isCreditOk( String cardNumber );
	public boolean isDebtOk( String agency, String account );
}
